package org.ptech081.parking.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public Long identificacion;
    public List<Carro> misCarros;
    
    public Cliente() {
        this.misCarros = new ArrayList<Carro>();
    }

    public Cliente(String nombre, String apellidos, Long identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.misCarros = new ArrayList<Carro>();
    } 

    //primera sobrecarga de addCar
    public void addCar(Carro car){
        this.misCarros.add(car);
    }

    //segunda sobrecarga de addCar
    public void addCar(String placa, 
                        TipoVehiculo tv){
            Carro car = new Carro(placa , tv);
            this.misCarros.add(car);
    }

}
