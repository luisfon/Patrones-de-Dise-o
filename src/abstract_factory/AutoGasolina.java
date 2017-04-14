package abstract_factory;

public class AutoGasolina extends Automovil {

	public AutoGasolina(String modelo, String color, String potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		
		System.out.println("Auto Gasolina");
		System.out.println("modelo "+modelo);
		System.out.println("color "+color);
		System.out.println("potencia "+potencia);
		System.out.println("espacio "+espacio);
		
	}

}
