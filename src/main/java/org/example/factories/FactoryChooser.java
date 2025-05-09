package org.example.factories;

import java.util.Locale;

public final class FactoryChooser {
    public FactoryTransporte elegirTransporte(String tipo) {
        switch (tipo.toLowerCase()) {
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
