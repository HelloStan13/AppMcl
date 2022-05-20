package com.sofka.app.almacenamiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosDemarca implements ValueObject<String> {
    private final String nombre;

    public DatosDemarca(String nombre) {
        Objects.requireNonNull(nombre);
        this.nombre = nombre;
        if(this.nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
    }

    @Override
    public String value() {   return nombre;  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosDemarca)) return false;
        DatosDemarca that = (DatosDemarca) o;
        return nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}


