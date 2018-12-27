package campoOlivos;

import campoOlivos.Campo;


public class CampoAplicacion {
	
	public static void main(String[] args) { // función principal
		Campo olivo1=new Campo(10, 30); // objeto
		Campo olivo2=new Campo(10, 40); // objeto
		
			System.out.println("La edad del olivo1 es: "+olivo1.edadOlivo);

		olivo1.edadOlivo=20; //cambio de edad del olivo1
			System.out.println("La nueva edad del olivo1 es: "+olivo1.edadOlivo);
		
		double beneficios1=olivo1.beneficio();
			System.out.println("El beneficio del primer olivo es: "+beneficios1);
		
		double beneficios2=olivo2.beneficio();
			System.out.println("El beneficio del segundo olivo es: "+beneficios2 );
			System.out.println("La edad del olivo2 es: "+olivo2.edadOlivo);
		
		olivo2.sumaEdad(40); // incremento de la edad mediante funcion
			System.out.println("La nueva edad del olivo2 es: "+olivo2.edadOlivo);
			System.out.println("El número de olivas del olivo2 es: "+olivo2.numeroOlivas);
			
		olivo2.sumaOlivas(20); // incremento el numero de olivas
			System.out.println("El nuevo número de olivas del olivo2 es: "+olivo2.numeroOlivas);
	}
}