package actividades_strings;

public class ejer8_StringInverso {
	public static String palabraAlReverso(String palabra){
		String reversoPalabra ="";
		
		for (int i=palabra.length()-1;i>=0;i--) {
			reversoPalabra = reversoPalabra + palabra.charAt(i);
		}
		return reversoPalabra;
		}


	public static void main(String[] args) {
		// MAIN 
		String ejemplo="boca juniors";
		String retorno = palabraAlReverso(ejemplo);
		System.out.println(retorno);
	}

}
