package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.recepcion.values.InventarioId;

public class Inventario extends Entity<InventarioId> {
    public Inventario(InventarioId inventarioId) {
        super(inventarioId);
    }
}
