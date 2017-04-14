package abstract_factory;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

	@Override
	public Automovil crearAuto(String modelo, String color, String potencia, double espacio) {
		// TODO Auto-generated method stub
		return new AutoElectrico(modelo, color, potencia, espacio);
	}

}
