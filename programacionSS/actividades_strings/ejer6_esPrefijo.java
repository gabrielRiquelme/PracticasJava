package actividades_strings;

public class ejer6_esPrefijo {
	public static boolean esPrefijo(String prefijo,String s) {
	    if (s.length() > prefijo.length()) {
	        return false;
	    }

	    for (int i = 0; i < s.length(); i++) {
	        if (prefijo.charAt(i) != s.charAt(i)) {
	            return false;
	        }
	    }

	    return true;
	}
	
	
	public static void main(String[] args) {
	    String palabra = "re";
	    String prefijo = "antikkriber";
	    System.out.println(esPrefijo(prefijo, palabra));
	}

}
