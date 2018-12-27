package videotutorial04;

public class IntercambiarVariables {

	public static void main(String[] args) {
		
		int num1= 4, num2= 5;
		System.out.println("Antes, el numero 1 tenia el valor de "+num1+" y el numero 2 tenia el valor de "+num2);
		System.out.println(intercambia(num1, num2));
		
	}
	
	private static String intercambia(int a, int b){
		
		String resultado = "";
		int temp = a;
		a = b;
		b = temp;
		
		resultado = "Ahora, el numero 1 tiene el valor de "+a+" y el numero 2 tiene el valor de "+b;
		
		return resultado;		
	}
}
