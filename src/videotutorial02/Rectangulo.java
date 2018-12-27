/**
 * @author Vayo
 */
package videotutorial02;


public class Rectangulo {
	
	
	public static void main(String[] args) {
		//Declaracion e inicializacion de variables
		double ancho= 7.3, altura= 5.1, area= 0, perimetro= 0, diagonal= 0;
		//Calculos		
		area= ancho*altura;
		perimetro= 2*(ancho+altura);
		diagonal= Math.sqrt(ancho*ancho+altura*altura);
		//Cadena de caracteres mostrada por pantalla
		System.out.println("La base: \t"+ancho);
		System.out.println("La altura: \t"+altura);
		System.out.println("El area: \t"+area);
		System.out.println("El perimetro: \t"+perimetro);
		System.out.println("La diagonal: \t"+diagonal);
	}
}
