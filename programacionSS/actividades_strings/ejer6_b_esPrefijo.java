package actividades_strings;

public class ejer6_b_esPrefijo {
    public static boolean esPrefijo(String prefijo, String s, int pos) {
        if (pos + prefijo.length() > s.length()) {
            return false;
        }

        for (int i = 0; i < prefijo.length(); i++) {
        	// TENER EN CUENTA QUE ACA HAGO "POS + I"
            if (prefijo.charAt(i) != s.charAt(pos + i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palabra = "RE";
        String prefijo = "aaREbostero";
        System.out.println(esPrefijo(palabra, prefijo, 2));
    }
}