package actividades_strings;

public class ejer5_duodromo {

    public static void main(String[] args) {
       
    	String palabra = "llaammaarraaddaa";
    	boolean bandera = true;
    	int contadorPares = 0;
        
        for(int i = 1; i < palabra.length(); i += 2) {
            if (palabra.charAt(i) == palabra.charAt(i-1)) {
                contadorPares++;
            } else {
                bandera = false;
                break;
            }
        }
        
        if (bandera && contadorPares > 0) {
            System.out.println("Palindroma");
        } else {
            System.out.println("No es palindroma");
        }
        
    }
}