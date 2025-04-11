
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f = new Fecha(8,4,2025);
		System.out.println(f); //INCORRECTO | IMPRIME ESPACIO EN MEMORIA;
		f.imprimirFecha();     //CORRECTO   | IMPRIME VALOR DESDE FUNCION; 
		
		Fecha f1=new Fecha(1,1,2025);
		f1.imprimirFecha();
		f1.dia = 20; // MODIFICO VALOR DE DIA DE LA CLASE F1.
		f1.imprimirFecha();
		
		// Fecha.bisiesto(anio); USO DE METODO DE CLASE | PROBAR EJEMPLO CON PP.
		
}
}
