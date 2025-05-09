package org.example.factories;

import org.example.implementaciones.Auto;
import org.example.implementaciones.Transporte;

public class FactoryAuto implements FactoryTransporte
{
    @Override
    public Transporte crearTransporte() {
        return new Auto();
    }
}