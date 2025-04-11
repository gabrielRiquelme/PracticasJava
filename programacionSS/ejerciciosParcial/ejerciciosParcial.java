package ejerciciosParcial;

public class ejerciciosParcial {
	public static String resto(String s) {
		String nuevo= "";
		for(int i=1;i<s.length();i++){
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static String tomarCaracters(String s,int desde,int cant) {

		
		if(s.length()==0) {
			return "";
		}
		if(desde == 0 && cant>0){
			return s.charAt(0)+tomarCaracters(resto(s), desde, cant-1);
		}
		
		return tomarCaracters(resto(s), desde-1, cant);
	}

	public static void main(String[] args) {
		//MAIN
		
		System.out.println(tomarCaracters("sobrenatural",3,5));
		
		
		

	}

}
