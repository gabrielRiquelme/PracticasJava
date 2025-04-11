//Hacer la funcion public static boolean esSubstring(String s1, String s2)
//que retorna true si y sólo si s1 esta incluido en s2
package actividades_strings;

public class ejer7 {
	
	public static boolean subString(String palabra, String subPalabra){
		boolean bandera = true;
		if(subPalabra.length() > palabra.length()) {return false;}
		for (int i=0;i<subPalabra.length()-1;i++) {
			if(subPalabra.charAt(i) != palabra.charAt(i)){
				bandera = false;
			}
		}
		return bandera;
	}

	public static void main(String[] args) {
		String palabra="Boca juniors";
		String subPalabra="river";
		System.out.println(subString(palabra,subPalabra));
	}

}
