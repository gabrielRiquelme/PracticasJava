package actividades_enteros;
import java.util.Scanner;

public class factorial_4 {
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingre un numero: ");
		
		numero=sc.nextInt();

		int acumulador=1;
		for(int i=1;i <= numero;i++) {
			acumulador *= i;

			System.out.println("Factorial de "+numero+" en la iteracion numero "+i+" = "+acumulador);
			}
		
		
		sc.close();
	}

}
