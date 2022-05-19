package com.sofka.app.almacenamiento.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DatosDemarca;

import java.util.Objects;

public class ClasificarporMarca extends Command {
    private AlmacenamientoId almacenamientoId;
    private DatosDemarca datosDemarca;

    public ClasificarporMarca(AlmacenamientoId almacenamientoId, DatosDemarca datosDemarca) {
        Objects.requireNonNull(almacenamientoId);
        Objects.requireNonNull(datosDemarca);
        this.almacenamientoId = almacenamientoId;
        this.datosDemarca = datosDemarca;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public DatosDemarca getDatosDemarca() {
        return datosDemarca;
    }
}
