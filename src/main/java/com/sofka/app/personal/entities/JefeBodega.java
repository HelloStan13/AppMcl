package com.sofka.app.personal.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.JefeBodegaId;

import java.util.Objects;

public class JefeBodega extends Entity<JefeBodegaId> {
    private DatosPersonales datosPersonales;

    public JefeBodega(JefeBodegaId jefeBodegaId, DatosPersonales datosPersonales) {
        super(jefeBodegaId);
        this.datosPersonales = datosPersonales;
    }

    //comportamientos
    public void actualizarDatos(DatosPersonales datosPersonales) {
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }
}
