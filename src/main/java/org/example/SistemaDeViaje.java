package org.example;

import org.example.exceptions.InvalidTransportException;
import org.example.exceptions.MissingSubteServiceException;
import org.example.factories.FactoryTransporte;
import org.example.implementaciones.Transporte;

public class SistemaDeViaje {
    private ServicioSubte servicioSubte = new ServicioSubte();
    private FactoryTransporte factory = null;

    public String transportar(String tipo, String origen, String destino) throws MissingSubteServiceException, InvalidTransportException {
        Transporte transporte = factory.elegirTransporte(tipo).crearTransporte();
        if (transporte == null) {
            throw new InvalidTransportException("No se encontró el servicio de transporte solicitado.");
        }
        return transporte.transportar(origen, destino);
    }
}
