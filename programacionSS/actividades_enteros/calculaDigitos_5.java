package actividades_enteros;
import java.util.Scanner;

public class calculaDigitos_5 {
	
	public static int contarDigitos(int numero) {
	    String cadena = String.valueOf(Math.abs(numero)); // Convertir a cadena
	    return cadena.length(); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num;
		System.out.println("Ingre un numero del 0 al infinito: ");
		num=sc.nextInt();
		
		int digit;
		digit = contarDigitos(num);
		System.out.println("El número " + num + " tiene " + digit + " dígito/s.");
		sc.close();
	}

}
