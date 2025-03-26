package recursividad;

public class potencia {
	public static int potencia(int base,int exponente){
		if(exponente==0){
			return 1;
		}else {
			return base * potencia(base,exponente-1);
		}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(potencia(3,2));
	}

}
