package com.sofka.app.personal.values;

import co.com.sofka.domain.generic.Identity;

public class AdministradorId extends Identity {
    private AdministradorId(String id){
        super(id);
    }

    public AdministradorId(){}

    public static AdministradorId of(String id) {
        return new AdministradorId(id);
    }
}
