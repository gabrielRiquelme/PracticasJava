package ejerciciosParcial;

public class ejerciciosParcial2 {
	
	public static String resto(String s) {
		String nuevo= "";
		for(int i=1;i<s.length();i++){
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static String insertarOrdenados(String s,char a){
		
		if (s.length()==0){
			return a+s;
		}
		if(s.charAt(0)<a){
			return s.charAt(0)+insertarOrdenados(resto(s), a);
		}else {
			return a+s;
		}

	}

	public static void main(String[] args) {
		// MAIN
		
		System.out.println(insertarOrdenados("abcdefgijk", 'h'));
		
	}

}
