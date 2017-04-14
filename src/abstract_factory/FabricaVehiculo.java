package abstract_factory;

public interface FabricaVehiculo {

	Automovil crearAuto(String modelo, String color, String potencia, double espacio);
}
