package org.example;

import org.example.exceptions.InvalidTransportException;
import org.example.exceptions.MissingSubteServiceException;

public class Main {
    public static void main(String[] args) {
        SistemaDeViaje sistemaDeViaje = new SistemaDeViaje();
        try {
            String resultado = sistemaDeViaje.transportar("Auto", "Buenos Aires", "La Plata");
            System.out.println(resultado);
        } catch (MissingSubteServiceException | InvalidTransportException e) {
            System.err.println(e.getMessage());
        }

    }
}