package org.example.factories;

import org.example.ServicioSubte;
import org.example.implementaciones.Subte;
import org.example.implementaciones.Transporte;

public class FactorySubte implements FactoryTransporte {
    private ServicioSubte servicioSubte = new ServicioSubte();

    @Override
    public Transporte crearTransporte() {
        Subte subte = new Subte();
        subte.setServicioSubte(servicioSubte);
        return subte;
    }
}
