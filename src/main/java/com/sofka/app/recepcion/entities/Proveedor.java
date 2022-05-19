package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.recepcion.values.ProveedorId;

public class Proveedor extends Entity<ProveedorId> {

    public Proveedor(ProveedorId proveedorId) {
        super(proveedorId);
    }
}
