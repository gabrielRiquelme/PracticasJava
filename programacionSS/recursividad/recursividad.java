package recursividad;

public class recursividad {
	
	//Funcion recursiva, se llama asi misma para retornar un valor x
	public static int factorial(int n) {
			if (n == 0) {
				return 1;
			}else {
				return n * factorial(n-1);
			}
		}
	
	public static int recursiva(int n){
		if (n==1) {
			return 1;
		}
		else {
			return n + recursiva(n-1);
		}
		}
		
		public static void imprimirHasta(int n){
			if (n==1) {
				System.out.println(n);
			}else {
				imprimirHasta(n-1);
				System.out.println(n);
			}
			
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Punto 1 =");
		int x= recursiva(4);
		System.out.println(x);
		
		System.out.println("Punto 2 =");
		imprimirHasta(10);

		
		
		
		
	}

}
