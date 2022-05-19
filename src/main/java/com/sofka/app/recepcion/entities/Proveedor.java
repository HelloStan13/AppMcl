package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.recepcion.values.ProveedorId;

public class Proveedor extends Entity<ProveedorId> {
    private ProveedorId proovedorId;
    private Datos datos;
    private Direccion direccion;

    public Proveedor(ProveedorId proveedorId) {
        super(proveedorId);
        this.datos = datos;
        this.direccion = direccion;
    }


    //Propiedades


    public ProveedorId proveedorId() {
        return proovedorId;
    }

    public Datos datos() {
        return datos;
    }

    public Direccion direccion() {
        return direccion;
    }
}
