package com.sofka.app.personal.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.personal.values.AdministradorId;
import com.sofka.app.personal.values.DatosPersonales;

import java.util.Objects;

public class Administrador extends Entity<AdministradorId> {
    private DatosPersonales datospersonales;

    public Administrador(AdministradorId administradorId, DatosPersonales datospersonales) {
        super(administradorId);
        this.datospersonales = datospersonales;
    }

    //comportamientos

    public void actualizarDatos(DatosPersonales datosPersonales) {
        this.datospersonales = Objects.requireNonNull(datosPersonales);
    }

    //Propiedades
    public DatosPersonales datospersonales() {
        return datospersonales;
    }
}
