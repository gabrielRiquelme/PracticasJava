package actividades_enteros;
import java.util.Scanner;

public class proxPrimo_3 {
	
	static int divisores(int num_1) {
		int cont = 0;
		for(int i=1; i <= num_1;i++) {
			if (num_1 % i == 0) {
				cont = cont+1;
			}	
		}
		return cont;
	}
	
	static boolean esPrimo(int numero_1) {
		boolean resultado;
		
		if (numero_1 == 2) {
			return resultado = true;
		}else {
			return resultado = false;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero_1;
		
		Scanner sc= new Scanner(System.in); //Creo instancia de SC.

		System.out.println("Ingre un numero: ");
		numero_1=sc.nextInt();	//Asigno datos ingresados
		
		boolean flag= false;
		int i = 1;
		while(flag == false){
			
			int numIterado=numero_1+i;
			int divisores = divisores(numIterado);
			boolean esprimo = esPrimo(divisores);
	
			if (esprimo == true) {
				flag = true;
				System.out.println(numIterado);
			}
			i++;
		}		
		sc.close();
	}

}
