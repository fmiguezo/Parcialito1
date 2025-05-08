package org.example.implementaciones;

public class Dron implements Transporte {

    @Override
    public String transportar(String origen, String destino) {
        return "Transporte en dron de " + origen + " a " + destino;
    }
}
