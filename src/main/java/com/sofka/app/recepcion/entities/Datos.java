package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Datos implements ValueObject<String> {
    private final String nombreProveedor;

    public Datos(String nombreProveedor) {
        Objects.requireNonNull(nombreProveedor);
        this.nombreProveedor = nombreProveedor;

        if(this.nombreProveedor.isBlank()){
            throw new IllegalArgumentException("El nombre del proovedor no puede ser vacío");
        }

        if(this.nombreProveedor.length() >= 50){
            throw new IllegalArgumentException("El nombre del proovedor no puede ser tal largo");
        }
    }

    @Override
    public String value() {
        return nombreProveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Datos)) return false;
        Datos datos = (Datos) o;
        return nombreProveedor.equals(datos.nombreProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreProveedor);
    }
}
