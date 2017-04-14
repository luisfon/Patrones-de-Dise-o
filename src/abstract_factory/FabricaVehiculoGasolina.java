package abstract_factory;

public class FabricaVehiculoGasolina implements FabricaVehiculo{

	@Override
	public Automovil crearAuto(String modelo, String color, String potencia, double espacio) {
		// TODO Auto-generated method stub
		return new AutoGasolina( modelo,  color,  potencia, espacio);
	}

}
