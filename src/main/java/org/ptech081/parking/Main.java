package org.ptech081.parking;

import org.ptech081.parking.entities.*;

public class Main {
    public static void main(String[] args) {
        
        //crear carros con los constructores:
        Carro carrito1 = new Carro("ASB 456" , 
                                TipoVehiculo.MOTO);

        Carro carrito2 = new Carro();
        carrito2.placa = "HGF 365";
        carrito2.tipoVehiculo = TipoVehiculo.BUS;

        //crear clientes 
        Cliente cliente1 = new Cliente("Dayana", 
                            "Bohorquez", 
                            102354618L);
        
        //invocar el metodo addCar:
        cliente1.addCar(carrito1);
        cliente1.addCar("ASD 123" , 
                        TipoVehiculo.CAMIONETA);
        //recorrer los carros del cliente
        for(Carro c :    cliente1.misCarros){
            System.out.println(c.placa + " " + c.tipoVehiculo);
            System.out.println("---------------------");
        }
    }
}