package org.example.implementaciones;

import org.example.exceptions.MissingSubteServiceException;
import org.example.ServicioSubte;

public class Subte implements Transporte {
    private ServicioSubte servicioSubte = null;

    @Override
    public String transportar(String origen, String destino) throws MissingSubteServiceException {
        if (servicioSubte == null) {
            throw new MissingSubteServiceException("No se ha configurado el servicio de subte.");
        }
        return "Transporte en subte de " + origen + " a " + destino + ".";
    }

    public void setServicioSubte(ServicioSubte servicioSubte) {
        this.servicioSubte = servicioSubte;
    }
}
