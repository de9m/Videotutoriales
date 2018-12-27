package campoOlivos;

public class Campo{
	int numeroOlivas; // variable de instancia o miembro dato
	int edadOlivo; // variable de instancia o miembro dato
	static final double PVPOLIVA=0.05; // variable de clase
	
	Campo(int edad, int numOlivas){ // primer constructor recibe los valores de los objetos
		this.edadOlivo=edad; // los valores son asignados a las variables de instancia.
		this.numeroOlivas=numOlivas;
	}
	
/*	Campo(edadOlivo, numeroOlivas){ // segundo constructor recibe los valores de los objetos
		this.edadOlivo=30; // los valores son asignados a las variables de instancia.
		this.numeroOlivas=numeroOlivas;
	}
*/

	double beneficio(){ // función calculo beneficio
		double dinero = numeroOlivas*PVPOLIVA ;
		return dinero;
	}
	
	void sumaEdad (int incremento){ // función incremento edad del olivo no devuelve nada
		edadOlivo+=incremento;
	}
	
	void sumaOlivas (int sumaOlivas){ // función incremento de olivas no devuelve nada
		numeroOlivas+=sumaOlivas;
	}
}