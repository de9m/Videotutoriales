package videotutorial04;

import java.io.*;

import entradaDatos.Entrada;

public class Mayor {
	

	//Calculos.
	public static int asignarMayor (int numero1, int numero2, int numero3){
		
		int mayor = 0;	
		
		if(numero1 >= numero2 && numero1 >= numero3){			
			mayor = numero1;
			
    	}else if(numero2 >= numero1 && numero2 >= numero3){
    		mayor = numero2;
    		
    	}else{
    		mayor = numero3;
    		
    	}
		return mayor;
	}
	
	//Metodo que muestra por pantalla el resultado final.
	public static void mostrarMayor(int mayor) {
		System.out.println("El mayor n�mero de los tres es el "+mayor+".");
	}
	
	//Metodo principal (MAIN).
	public static void main(String[] args) throws IOException{
		
		//Declaraci�n de Variables
		int mayor, numero1, numero2, numero3;	
		
		// Pedimos los tres numeros por pantalla.
		System.out.print("Numero 1: ");		
		numero1 = Entrada.leerEntero();
		
		System.out.print("Numero 2: ");
		numero2 = Entrada.leerEntero();
		
		System.out.print("Numero 3: ");
		numero3 = Entrada.leerEntero();
		
		// Llamadas a los metodos.			
		mayor = asignarMayor(numero1,numero2, numero3);
		mostrarMayor(mayor);		
	}
}