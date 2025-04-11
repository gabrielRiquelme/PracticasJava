//Declaro  clase fecha con intancias dia, mes & anio

public class Fecha {
	int dia;
	int mes;
	int anio;
	
	//Constructor
	
	public Fecha(int dia,int mes,int anio) {
		this.dia = dia; //this variable para referenciar contexto.
		this.mes = mes;
		this.anio = anio;
		
	}
	//Metodo Instancia | No lleva static | TOMA VARIABLES DE CONTEXTO
	public void imprimirFecha() {
		System.out.println(this.dia +"-"+ this.mes +"-"+ this.anio);
	}
	// Ejmplos de metodos de instancia (ver PDF.)
	
	// Metodo para determinar si es verano o no.
	
	//Metodo  para determinar si es 4.
	
	//METODO DE CLASE SI LLEVA STATIC (VER EJEMPLO DE AÑO BISIESTO) TOMO VARIABLES DIRECTO DEL OBJETO
	
	
	
	
	
	
}
