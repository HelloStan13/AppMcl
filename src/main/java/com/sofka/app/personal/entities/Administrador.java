package com.sofka.app.personal.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.personal.values.AdministradorId;
import com.sofka.app.personal.values.DatosPersonales;

public class Administrador extends Entity<AdministradorId> {
    private DatosPersonales datospersonales;

    public Administrador(AdministradorId entityId) {
        super(entityId);
    }
}
