package org.example;

import org.example.exceptions.InvalidTransportException;
import org.example.exceptions.MissingSubteServiceException;
import org.example.factories.FactoryChooser;
import org.example.factories.FactoryTransporte;
import org.example.implementaciones.Transporte;

public class SistemaDeViaje {
    private ServicioSubte servicioSubte = new ServicioSubte();
    private FactoryChooser factoryChooser = new FactoryChooser();

    public String transportar(String tipo, String origen, String destino) throws MissingSubteServiceException, InvalidTransportException {
        FactoryTransporte factory = factoryChooser.elegirTransporte(tipo);
        Transporte transporte = factory.crearTransporte();
        if (transporte == null) {
            throw new InvalidTransportException("No se encontró el servicio de transporte solicitado.");
        }
        return transporte.transportar(origen, destino);
    }
}
