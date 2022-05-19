package com.sofka.app.personal.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<String> {
    private final String nombre;
    private final String apellido;
    private final String correo;

    public DatosPersonales(String nombre, String apellido, String correo) {
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(apellido);
        Objects.requireNonNull(correo);
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;

        if(this.nombre.length() <= 4){
            throw new IllegalArgumentException("El nombre debe tener más de 4 caracteres");
        }
        if(this.apellido.length() <= 4){
            throw new IllegalArgumentException("El apellido debe tener más de 4 caracteres");
        }
        if(this.apellido.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
        if(this.apellido.isBlank()){
            throw new IllegalArgumentException("El apellido no puede ser vacío");
        }
        if(this.correo.isBlank()){
            throw new IllegalArgumentException("El apellido no puede ser vacío");
        }

    }
    @Override
    public String value() {
        return nombre + apellido + correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosPersonales)) return false;
        DatosPersonales that = (DatosPersonales) o;
        return nombre.equals(that.nombre) && apellido.equals(that.apellido) && correo.equals(that.correo) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, correo);
    }

}
