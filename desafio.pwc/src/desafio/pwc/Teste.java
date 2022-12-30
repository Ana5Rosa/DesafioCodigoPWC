package desafio.pwc;

import java.util.Arrays;

import junit.framework.*;

public class Teste extends TestCase {
	public void testeCasoSimples() {
		//“Miritiba 339” -> {“Miritiba”, “339”}
		//“Babaçu 500” -> {“Babaçu”, “500”}
		//“Cambuí 804B” -> {“Cambuí”, “804B”}
		
		String entrada1 = "Miritiba 339";
		String[] retornoEsperado1 = {"Miritiba", "339"};
		Endereco endereco1 = new Endereco(entrada1);
		String[] retornoFeito1 = endereco1.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado1), Arrays.toString(retornoFeito1));
		
		String entrada2 = "Babaçu 500";
		String[] retornoEsperado2 = {"Babaçu", "500"};
		Endereco endereco2 = new Endereco(entrada2);
		String[] retornoFeito2 = endereco2.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado2), Arrays.toString(retornoFeito2));
		
		String entrada3 = "Cambuí 804B";
		String[] retornoEsperado3 = {"Cambuí", "804B"};	
		Endereco endereco3 = new Endereco(entrada3);	
		String[] retornoFeito3 = endereco3.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado3), Arrays.toString(retornoFeito3));
	}
	
	public void testeCasosComplicados() {
		//“Rio Branco 23” -> {“Rio Branco”, “23”}
		//“Quirino dos Santos 23 b” -> {“Quirino dos Santos”, ”23 b”}
		
		String entrada = "Rio Branco 23";
		String[] retornoEsperado = {"Rio Branco", "23"};
		Endereco endereco = new Endereco(entrada);
		String[] retornoFeito = endereco.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado), Arrays.toString(retornoFeito));
		
		String entrada2 = "Quirino dos Santos 23 b";
		String[] retornoEsperado2 = {"Quirino dos Santos", "23 b"};				
		Endereco endereco2 = new Endereco(entrada2);
		String[] retornoFeito2 = endereco2.getEndereco();		
		
		assertEquals(Arrays.toString(retornoEsperado2), Arrays.toString(retornoFeito2));
	}
	
	public void testeCasosComplexos() {
		//"4, Rue de la République" -> {"Rue de la République", "4"}
		//"100 Broadway Av" -> {"Broadway Av&quot", "100"}
		//"Calle Sagasta, 26" -> {“Calle Sagasta”, “26”}
		//"Calle 44 No 1991" -> {“Calle 44”, “No 1991”}
		
		String entrada1 = "4, Rue de la République";
		String[] retornoEsperado1 = {"Rue de la République", "4"};
		Endereco endereco1 = new Endereco(entrada1);
		String[] retornoFeito1 = endereco1.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado1), Arrays.toString(retornoFeito1));
		
		String entrada2 = "100 Broadway Av";
		String[] retornoEsperado2 = {"Broadway Av", "100"};
		Endereco endereco2 = new Endereco(entrada2);
		String[] retornoFeito2 = endereco2.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado2), Arrays.toString(retornoFeito2));
		
		String entrada3 = "Calle Sagasta, 26";
		String[] retornoEsperado3 = {"Calle Sagasta", "26"};
		Endereco endereco3 = new Endereco(entrada3);
		String[] retornoFeito3 = endereco3.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado3), Arrays.toString(retornoFeito3));
		
		String entrada4 = "Calle 44 No 1991";
		String[] retornoEsperado4 = {"Calle 44", "No 1991"};
		Endereco endereco4 = new Endereco(entrada4);
		String[] retornoFeito4 = endereco4.getEndereco();
		
		assertEquals(Arrays.toString(retornoEsperado4), Arrays.toString(retornoFeito4));
	}
}
