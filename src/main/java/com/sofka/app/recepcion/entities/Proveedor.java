package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.recepcion.values.Datos;
import com.sofka.app.recepcion.values.Direccion;
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

//Comportamientos

    public void agregarProovedor(Datos datos, Direccion direccion){
        this.datos = datos;
        this.direccion = direccion;
    }
    public void editarProovedor(ProveedorId proveedorId){
        this.proovedorId = proveedorId;
    }
    public void eliminarProovedor(ProveedorId proveedorId){
        if(proovedorId != null){
            this.proovedorId = proovedorId;
        }
    }

    //Propiedades


    public ProveedorId proveedorId() {
        return proveedorId();
    }

    public Datos datos() {
        return datos;
    }

    public Direccion direccion() {
        return direccion;
    }
}
