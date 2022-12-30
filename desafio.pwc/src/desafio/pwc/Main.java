package desafio.pwc;

public class Main {
	public static void main(String[] args) {
		// “Miritiba 339” ->  {“Miritiba”, “339”}
		Endereco end = new Endereco("Miritiba 339");
		String[] endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “Babaçu 500”   -> { “Babaçu”, “500”}
		end = new Endereco("Babaçu 500");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “Cambuí 804B”  -> {“Cambuí”, “123B”}
		end = new Endereco("Cambuí 804B");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “Rio Branco 23” -> {“Rio Branco”, “23”}
		end = new Endereco("Rio Branco 23");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “Quirino dos Santos 23 b” -> {“Quirino dos Santos”, ”23 b”}
		end = new Endereco("Quirino dos Santos 23 b");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “4, Rue de la République” -> {"Rue de la République", "4"}
		end = new Endereco("4, Rue de la République");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “100 Broadway Av” -> {"Broadway Av", "100"}
		end = new Endereco("100 Broadway Av");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “Calle Sagasta, 26” -> {“Calle Sagasta”, “26”}
		end = new Endereco("Calle Sagasta, 26");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);

		System.out.println();

		// “Calle 44 No 1991” -> {“Calle 44”, “No 1991”}
		end = new Endereco("Calle 44 No 1991");
		endereco = end.getEndereco();
		System.out.println(endereco[0]);
		System.out.println(endereco[1]);
	}
}
