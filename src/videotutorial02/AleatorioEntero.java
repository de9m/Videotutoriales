/**
 * @author Vayo
 */
package videotutorial02;

public class AleatorioEntero {

	
	public static void main(String[] args) {
		//Declaración e inicializacion de variables
		int n= 10, m= 2;
		//Cadena de Caracteres mostrada por pantalla
		System.out.println("El numero aleatorio entre 0 y 10 es "+(int)(Math.random()*n-1));
		System.out.println("El numero aleatorio entre 2 y 10 es "+(int)(m+(n-m)*Math.random()));
	}
}
