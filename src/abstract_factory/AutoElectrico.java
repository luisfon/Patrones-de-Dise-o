package abstract_factory;

public class AutoElectrico extends Automovil {

	public AutoElectrico(String modelo, String color, String potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		
		System.out.println("Auto Electrico ");
		System.out.println("modelo "+modelo);
		System.out.println("color "+color);
		System.out.println("potencia "+potencia);
		System.out.println("espacio "+espacio);
			
	}

}
