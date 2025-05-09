package org.example.factories;

import java.util.Locale;

public final class FactoryChooser {
    public FactoryTransporte elegirTransporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "auto":
                return new FactoryAuto();
            case "subte":
                return new FactorySubte();
            case "dron":
                return new FactoryDron();
            default:
                throw new IllegalArgumentException("Tipo de transporte no válido");
        }
    }
}
