package actividades_strings;
import java.util.Scanner;


//PDF A VER = Strings2022 

public class ejer4_stringsIguales {
	
	public static boolean sonIguales(String s1,String s2){
		boolean resultado = true;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) != s2.charAt(i)){
				//return resultado;
				resultado = false;
			}
			
		}
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//int cont = 0;
		//for (int i=0;i<fruta.length();i++) {
			//System.out.println(fruta.charAt(i));
		//}
		

		//int indice=fruta.indexOf('a');
		//System.out.println(indice);
		//for(int i=0;i<palabra.length();i++) {
		//	if(palabra.charAt(i)!='a'){
		//		cont++;
		//	}
		//}
		//System.out.println("La palabra tiene "+cont+" consonantes");
		//Para comparar String debo usar "equals()"
		//Ej nombre1.equals(nombre2); de otro modo(a == b)comparare espacios en memoria.
		String fruta = "river";
		String palabra="boca";
		boolean retorno=true;
		
		if(fruta.length() != palabra.length()){
			System.out.println("Palabras diferentes");
		}else{
			retorno = sonIguales(fruta, palabra);
			if(retorno == true) {
				System.out.println("Las palabras son iguales");
			}else {
				System.out.println("Las palabras son iguales");
			}
		}
		

		
	}

}
