package com.sofka.app.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.app.almacenamiento.commands.DespacharProductos;

import java.util.Objects;

public class Novedades implements ValueObject<String> {
    private final String descripcion;

    public Novedades(String descripcion) {
        Objects.requireNonNull(descripcion);
        this.descripcion = descripcion;

        if(this.descripcion.isBlank()){
            throw new IllegalArgumentException("Las novedades no pueden estar vacías");
        }
    }

    @Override
    public String value() { return descripcion;    }

}
