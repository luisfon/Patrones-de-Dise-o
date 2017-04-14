package abstract_factory;

public abstract class Automovil {

	protected String modelo;
	protected String color;
	protected String potencia;
	protected double espacio;
	
	public Automovil(String modelo, String color, String potencia, double espacio) {
		
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.espacio = espacio;
	}
	
	public abstract void mostrarCaracteristicas();
}
