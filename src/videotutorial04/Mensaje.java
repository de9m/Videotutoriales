package videotutorial04;

public class Mensaje {

	public static void main(String[] args) {
		
		mostrarMensaje("Bienvenida");
		
		mostrarMensaje("Despedida");

	}
	
	private static void mostrarMensaje(String mensaje){
		
		System.out.println("***"+mensaje+"***");
	}
}
