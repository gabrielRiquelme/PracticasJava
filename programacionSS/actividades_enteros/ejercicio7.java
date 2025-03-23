package actividades_enteros;

import java.util.Scanner;
import java.util.Random;

public class ejercicio7 {

	public static int aleatorio() {
		int numero;
		
		Random random = new Random();
		numero = random.nextInt(10)+1;
		return numero;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int numero = aleatorio();
		System.out.println(numero);
		int numIngresado=0;
		int cont = 0;
		
		while(cont <= 3){
			System.out.println("Ingrese un numero: ");
			numIngresado=sc.nextInt();
			if(cont < 3){
				if (numIngresado != numero) {
					if(numIngresado > numero){
						System.out.println("Usted fallo,le daremos una pista...El numero es MENOR");
					}else {
						System.out.println("Usted fallo,le daremos una pista...El numero es MAYOR");
					}
				}else {
					System.out.println("Usted acertado el numero aleatorio era = "+numero);
					break;
				}
			}
			cont++;
		}
		if (numIngresado != numero) {
			System.out.println("Usted a perdido, el numero era = "+numero);
		}
			
			
			
			
			
		sc.close();	
	}

}
