package org.example.implementaciones;

import org.example.exceptions.MissingSubteServiceException;
import org.example.exceptions.NoSubwayLinesException;
import org.example.ServicioSubte;

public class Subte implements Transporte {
    private ServicioSubte servicioSubte = null;

    @Override
    public String transportar(String origen, String destino) throws MissingSubteServiceException, NoSubwayLinesException {
        if (servicioSubte == null) {
            throw new MissingSubteServiceException("No se ha configurado el servicio de subte.");
        }
        if (false == servicioSubte.hayLineas(origen, destino)) {
            throw new NoSubwayLinesException("No hay líneas de subte disponibles entre " + origen + " y " + destino + ".");
        }
        return "Transporte en subte de " + origen + " a " + destino + ".";
    }

    public void setServicioSubte(ServicioSubte servicioSubte) {
        this.servicioSubte = servicioSubte;
    }
}
