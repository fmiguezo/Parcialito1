package org.example.implementaciones;

public class Auto implements Transporte {
    @Override
    public String transportar(String origen, String destino) {
        return "Transporte en auto de " + origen + " a " + destino;
    }
}
