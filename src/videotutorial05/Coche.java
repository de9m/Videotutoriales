package videotutorial05;

public class Coche {	
	
	//Atributos de clase
	private String color;
	private int marcha;
	private int velocidad;
	
	//Constructores definidos por el usuario
	public Coche (String color, int marcha, int velocidad) {
		
		this.color = color;
		this.marcha = marcha;
		this.velocidad = velocidad;
	
	}
	
	public Coche (int marcha, int velocidad) {		
		
		this.marcha = marcha;
		this.velocidad = velocidad;
	
	}	
	
	// La clase coche tiene 7 metodos publicos		

	public String getColor() {
		return color;
	}
	
	public void setColor(String nuevoColor) {
		this.color = nuevoColor;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setMarcha(int nuevaMarcha) {
		this.marcha = nuevaMarcha;
	}
	
	public void frenar(int reduccion){
		this.velocidad -= reduccion;
		
	}
	
	public void acelerar(int aumento){
		this.velocidad += aumento;
	}	
}
