package org.example.factories;

import org.example.implementaciones.Transporte;

public abstract class FactoryTransporte {
    public abstract Transporte crearTransporte();

    public FactoryTransporte elegirTransporte(String tipo) {
        switch (tipo) {
            case "Auto":
                return new FactoryAuto();
            case "Subte":
                return new FactorySubte();
            case "Dron":
                return new FactoryDron();
            default:
                throw new IllegalArgumentException("Tipo de transporte no válido");
        }
    }
}
