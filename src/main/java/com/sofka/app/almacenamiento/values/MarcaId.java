package com.sofka.app.almacenamiento.values;

import co.com.sofka.domain.generic.Identity;

public class MarcaId extends Identity {
    public MarcaId() {
    }

    public MarcaId(String id) {
        super(id);
    }

    public static  MarcaId of (String id) {
        return  new MarcaId(id);
    }
}
