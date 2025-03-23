package actividades_enteros;
import java.util.Scanner;

public class divisoresComunes_6 {
	
	
	public static int numeroMayor(int num1, int num2) {
		int numMayor = 0;
		
		if (num1 > num2) {
			numMayor=num1;
		}else {
			numMayor=num2;
		}
		return numMayor;
	}
	
	public static int divisoresC(int num1,int num2) {
		
		int delimitador=0;
		delimitador = numeroMayor(num1,num2);
		
		int cantDivisoresComunes = 0;
		
		for(int i=1;i < delimitador;i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				cantDivisoresComunes++;
			}
		}
		return cantDivisoresComunes;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Ingre un numero: ");
		num1=sc.nextInt();
		
		System.out.println("Ingre el segundo numero: ");
		num2=sc.nextInt();
		
		sc.close();
		
		int div=0;
		div = divisoresC(num1,num2);
		System.out.println(div);
		
	}

}
