package actividades_strings;

public class ejer5_duodromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "bbooccaa";
		char aux = palabra.charAt(0);
		int contador=1;
		
		for(int i = 0;i<palabra.length();i++) {
			if(palabra.charAt(i) == aux) {
				aux = palabra.charAt(i);
				contador++;
					
				
			}
		
		
		}
				
	}
}

