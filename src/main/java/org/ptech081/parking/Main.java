 package org.ptech081.parking;

import org.ptech081.parking.entities.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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

        Cliente cliente2 = new Cliente("Anyi", 
                            "Rojas", 
                            19874324L);
        
        //invocar el metodo addCar:
        cliente1.addCar(carrito1);
        cliente1.addCar("ASD 123" , 
                        TipoVehiculo.CAMIONETA);

        cliente2.addCar(carrito2);
        cliente2.addCar("AFT 356" , 
                        TipoVehiculo.MOTO);
        
        //crear cupos
        Cupo cupo1 = new Cupo('A');
        Cupo cupo2 = new Cupo('B');
    
        //crear dos registros E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);
        LocalTime horaFin = LocalTime.of(17 , 30 , 0);

        LocalDate fechaInicio2 = LocalDate.of(2024 , Month.APRIL , 30);
        LocalTime horaInicio2 = LocalTime.of(11 , 46 , 30);
        LocalDate fechaFin2 = LocalDate.of(2024, Month.MAY, 16);
        LocalTime horaFin2 = LocalTime.of(8 , 50 , 0);

        List<Registro> misRegistros = new ArrayList<Registro>();

        //crear registro
        Registro registro1 = new Registro(fechaInicio, horaInicio, fechaFin, horaFin, 5000L, cupo1, cliente1.misCarros.get(0), cliente1);

        Registro registro2 = new Registro(fechaInicio2, horaInicio2, fechaFin2, horaFin2, 10000L, cupo2, cliente2.misCarros.get(1), cliente2);

        //añadir registro a la lista
        misRegistros.add(registro1);

        misRegistros.add(registro2);
        
        System.out.println("Registros de E/S parking");
        for(Registro r : misRegistros){
            System.out.println( "Cliente:" + 
                                r.cliente.nombre + " " +
                                r.cliente.apellidos + "|" +
                                r.carro.placa + " " +
                                r.carro.tipoVehiculo + "|" +
                                r.valor + "|" +
                                r.fechaInicio + " " +
                                r.horaInicio + "|");
        }

       
    }
}