package org.example.factories;

import org.example.implementaciones.Dron;
import org.example.implementaciones.Transporte;

public class FactoryDron extends FactoryTransporte {
    @Override
    public Transporte crearTransporte() {
        return new Dron();
    }
}
