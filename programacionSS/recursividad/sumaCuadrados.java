package recursividad;

public class sumaCuadrados {
	
	public static int sumaCuadrados(int n){
		if (n==1) {
			return 1;
		}
		else {
			return (n*n)+sumaCuadrados(n-1);
		}
		}
	//MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumaCuadrados(10));

	}

}
