/*
Implementar una función que indique si una palabra es palíndrome.
Una palabra es palíndrome si se lee igual al derecho y al revés, por ejemplo, "ala", "ojo", "neuquen". 
*/
package actividades_strings;

public class ejer10_palindrome {
	public static boolean palindrome(String palabra) {
		boolean bandera = true;
		for (int i=0;i < palabra.length();i++) {
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-1 -i)){bandera = false; return bandera;}
		}
		
		return bandera;
	}
	public static void main(String[] args) {
		// MAIN
		String palabra="ojo";
		System.out.println(palindrome(palabra));

	}

}
