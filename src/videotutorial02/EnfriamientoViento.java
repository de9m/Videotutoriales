/**
 * @author Vayo
 */
package videotutorial02;

public class EnfriamientoViento {

	
	public static void main(String[] args) {
		//Declaraci�n e inicializacion de variables
		double w = 0, t = 200, v = 500;
		//Calculos
		w= 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		//Mostramos el resultado por pantalla
		System.out.println(w);

	}

}
