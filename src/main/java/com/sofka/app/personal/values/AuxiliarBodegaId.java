package com.sofka.app.personal.values;

import co.com.sofka.domain.generic.Identity;

public class AuxiliarBodegaId extends Identity {
    private AuxiliarBodegaId(String id){
        super(id);
    }

    public AuxiliarBodegaId(){}

    public static AuxiliarBodegaId of(String id) {
        return new AuxiliarBodegaId(id);
    }
}

