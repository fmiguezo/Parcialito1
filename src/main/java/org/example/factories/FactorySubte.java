package org.example.factories;

import org.example.implementaciones.Subte;
import org.example.implementaciones.Transporte;

public class FactorySubte implements FactoryTransporte {
    @Override
    public Transporte crearTransporte() {
        return new Subte();
    }
}
