package com.sofka.app.recepcion.values;

import co.com.sofka.domain.generic.Identity;

public class RecepcionId extends Identity {  private  RecepcionId(String id){
    super(id);
}

    public RecepcionId(){}

    public static RecepcionId of(String id) {
        return new RecepcionId(id);
    }
}
