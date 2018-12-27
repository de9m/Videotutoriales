/**
 * @author Vayo
 */
package videotutorial02;

public class OperadorUnario {

	
	public static void main(String[] args) {
		int i= 8, a= 0, b= 0, c= 0;
		a= i;  
		b= ++i; // o bien i--|| ++i ||--i
		c= i;
		System.out.println("\t\t\tAntes\t \tDurante\t \tDespués\t");
		System.out.println("Operador i++ \t\t"+a+" \t\t"+b+" \t\t"+c);
	}
}
