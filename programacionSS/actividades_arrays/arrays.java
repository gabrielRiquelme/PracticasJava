package actividades_arrays;

public class arrays {

	public static void main(String[] args) {
		//MAIN
		int promedio=0;
		//Punto 1
		int[] arreglo_numeros = new int[3];
		arreglo_numeros[0] = 6;
		arreglo_numeros[1] = 7;
		arreglo_numeros[2] = 8;
		
		for(int i = 0; i < arreglo_numeros.length; i++) {
			System.out.println(arreglo_numeros[i]);
			promedio = promedio + arreglo_numeros[i];
		}
		
		System.out.println(promedio / arreglo_numeros.length);
		//Punto 2
	}

}
