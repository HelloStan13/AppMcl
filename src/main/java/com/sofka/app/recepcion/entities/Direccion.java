package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String direccionProveedor;
    private final String ciudadProveedor;

    public Direccion(String direccionProveedor, String ciudadProveedor) {
        Objects.requireNonNull(direccionProveedor);
        this.direccionProveedor = direccionProveedor;
        Objects.requireNonNull(ciudadProveedor);
        this.ciudadProveedor = ciudadProveedor;

        if(this.direccionProveedor.isBlank()){
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }
        if(this.ciudadProveedor.isBlank()){
            throw new IllegalArgumentException("La ciudad no puede estar vacía");
        }
    }

    @Override
    public String value() {
        return direccionProveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Direccion)) return false;
        Direccion direccion = (Direccion) o;
        return direccionProveedor.equals(direccion.direccionProveedor);
    }


    @Override
    public int hashCode() {
        return Objects.hash(direccionProveedor);
    }
}

