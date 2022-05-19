package com.sofka.app.almacenamiento.values;

import co.com.sofka.domain.generic.Identity;

public class AlmacenamientoId extends Identity {
    private  AlmacenamientoId(String valor){
        super(valor);
    }

    public AlmacenamientoId(){}

    public static AlmacenamientoId of(String valor) {
        return new AlmacenamientoId(valor);
    }
}
