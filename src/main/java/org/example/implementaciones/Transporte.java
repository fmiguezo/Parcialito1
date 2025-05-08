package org.example.implementaciones;

import org.example.exceptions.MissingSubteServiceException;

public interface Transporte {
    public String transportar(String origen, String destino) throws MissingSubteServiceException;
}
