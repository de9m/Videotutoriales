package videotutorial05;

public class UsoCoche {

	public static void main(String[] args) {
		
		//Objetos
		Coche bmw = new Coche("rojo", 3, 90);
		Coche mercedes = new Coche(5, 120);
		
		//Comprobamos el funcionamiento de los metodos
		System.out.println("Color del BMW --> "+bmw.getColor());
		System.out.println("Marcha del BMW --> "+bmw.getMarcha());
		System.out.println("Marcha del Mercedes --> "+mercedes.getMarcha());
		System.out.println("Velocidad del BMW --> "+bmw.getVelocidad());
		bmw.frenar(30);
		System.out.println("Velocidad reducida del BMW --> "+bmw.getVelocidad());
		bmw.acelerar(50);
		System.out.println("Velocidad aumentada del BMW --> "+bmw.getVelocidad());		
	}
}