package com.sofka.app.personal.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.personal.values.AuxiliarBodegaId;
import com.sofka.app.personal.values.DatosPersonales;

public class AuxiliarBodega extends Entity<AuxiliarBodegaId> {
    private DatosPersonales datosPersonales;

    public AuxiliarBodega(AuxiliarBodegaId auxiliarBodegaId, DatosPersonales datosPersonales) {
        super(auxiliarBodegaId);
        this.datosPersonales = datosPersonales;
    }
}
