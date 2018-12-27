package videotutorial03;

import entradaDatos.*;
import java.io.*;


public class Bisiesto {

	public static void main(String[] args) {
		//Decalaración de variable
		
		int año=0;
		boolean bisiesto = false;
		
		//Entrada de datos
		
		System.out.print("Introduzca el año deseado: ");
		año = Entrada.leerEntero();
		
		//Cálculos
		
		bisiesto = ((año%4 == 0) && (año%100) != 0) || (año%400 == 0);
		
		//Salida de resultados
		
		if(bisiesto == true) {
			System.out.println("El año "+año+" es bisiesto");
		}else {
			System.out.println("El año "+año+" no es bisiesto");
		}
	}

}
