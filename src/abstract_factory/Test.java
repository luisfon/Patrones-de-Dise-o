package abstract_factory;

import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args) {
		
		  int numAuto=2;
		  
		Scanner obj=new Scanner(System.in);
		
		FabricaVehiculo fabrica;
		
       Automovil[] autos=new Automovil[numAuto];

       System.out.println("elija entre Auto Electrico(1) O Gasolina(2)");
       
       String eleccion=obj.next();
       
       if(eleccion.equals("1"))
       {
    	   fabrica= new FabricaVehiculoElectricidad();
       }
       else{
    	   fabrica=new FabricaVehiculoGasolina();
       }
       
       for(int index=0;index<numAuto;index++)
       {
    	   autos[index] = fabrica.crearAuto("drt","verde", "dos", 22.3);
       }
       
       for(Automovil x: autos)
       {
    	   x.mostrarCaracteristicas();
       }
       
	}

}
