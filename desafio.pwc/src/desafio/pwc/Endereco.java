package desafio.pwc;

public class Endereco {
	private String rua;
	private String numero;

	public Endereco(String endereco) {
		rua = new String();
		numero = new String();
		processaEndereco(endereco);
	}

	private void processaEndereco(String endereco) {
		int i = 0;
		char letra = endereco.charAt(i);
		//Caso 1: o número está no início
		while(Character.isDigit(letra) || i > endereco.length()) {
			this.numero += letra;
			i++;
			letra = endereco.charAt(i);
		}

		//Caso 2: o número está no final
		if(this.numero.length() == 0) {      
			// “Miritiba 339” ->  {“Miritiba”, “339”}
			String numInv = new String();

			for(i = endereco.length() - 1; i >= 0; i--) {
				letra = endereco.charAt(i);
				if(letra == ' ' || letra == ',') {
					break;
				}
				numInv += letra;
			}

			//Caso em que o numero tem um letra separada por espaço no final
			if(numInv.length() == 1 && !Character.isDigit(numInv.charAt(0))) {
				numInv += letra;
				i--;
				letra = endereco.charAt(i);
				while(Character.isDigit(letra)) {
					numInv += letra;
					i--;
					letra = endereco.charAt(i);
				}
			}
			//ordena numero
			for(int j = numInv.length() - 1; j >= 0; j--) {
				this.numero += numInv.charAt(j);
			}

			//Pega o nome da rua para o caso 2
			String ruaInv = new String();
			i--;
			int posicaoInicial = i;

			for(; i >= 0; i--) {
				letra = endereco.charAt(i);
				
				if(letra == ',') {
					continue;
				}
				
				//Caso em que o nome da rua e o numero é separado por No
				if(letra == 'o' && i == posicaoInicial) {
					i--;
					letra = endereco.charAt(i);
					if(letra == 'N') {
						String num = this.numero;
						this.numero = "No " + num;
						i--;
						i--;
						letra = endereco.charAt(i);
					} else {
						ruaInv += 'o';
					}
				}
				ruaInv += letra;
			}

			//ordena rua
			for(int j = ruaInv.length() - 1; j >= 0; j--) {
				this.rua += ruaInv.charAt(j);
			}
		} else {
			//Pega o nome da rua para o caso 1
			int posicaoInicial = i + 1;
			while(i < endereco.length() - 1) {
				i++;
				letra = endereco.charAt(i);
				if(i == posicaoInicial && letra == ' ') {
					continue;
				}
				this.rua += letra;
			}
		}
		
		//Erro: Endereço não possui número ou rua
		if(this.rua.length() == 0 || this.numero.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		//Erro: o numero armazenado não possui numeros
		boolean encontrouNumero = false;
		for(int j = 0; j < this.numero.length(); j++) {
			if(Character.isDigit(this.numero.charAt(j))) {
				encontrouNumero = true;
				break;
			}
		}
		
		if(!encontrouNumero) {
			throw new IllegalArgumentException();
		}
	}

	public String[] getEndereco() {
		String[] endereco = {this.rua, this.numero};
		return endereco;
	}
}
