/**
 * @author Vayo
 */
package videotutorial02;

public class Cilindro {

	
	public static void main(String[] args) {
		//Declaración e inicializacion de variables
		double area= 0, volumen= 0, r= 6, altura= 4;
		//Calculos
		area= 2*Math.PI*r*(r+altura);
		volumen= Math.PI*r*r*altura;
		//Cadena de caracteres mostrada por pantalla
		System.out.println("El area es\t"+area);
		System.out.println("El volumen es\t"+volumen);

	}

}
