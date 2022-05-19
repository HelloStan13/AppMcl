package com.sofka.app.almacenamiento.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DatosDemarca;
import com.sofka.app.almacenamiento.values.Estante;

import java.util.Objects;

public class AlmacenarPormarca  extends Command {
    private AlmacenamientoId almacenamientoId;
    private DatosDemarca datosDemarca;
    private Estante estante;

    public AlmacenarPormarca(AlmacenamientoId almacenamientoId, DatosDemarca datosDemarca, Estante estante) {
        Objects.requireNonNull(almacenamientoId);
        Objects.requireNonNull(datosDemarca);
        Objects.requireNonNull(estante);
        this.almacenamientoId = almacenamientoId;
        this.datosDemarca = datosDemarca;
        this.estante = estante;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public DatosDemarca getDatosDemarca() {
        return datosDemarca;
    }

    public Estante getEstante() {
        return estante;
    }
}


