package org.example.implementaciones;

import org.example.exceptions.MissingSubteServiceException;
import org.example.exceptions.NoSubwayLinesException;

public interface Transporte {
    public String transportar(String origen, String destino) throws MissingSubteServiceException, NoSubwayLinesException;
}
