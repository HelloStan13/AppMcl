package com.sofka.app.almacenamiento.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.almacenamiento.values.DatosDemarca;
import com.sofka.app.almacenamiento.values.Estante;

import java.util.Objects;

public class GenerarListadeMarcas extends Command {
    private DatosDemarca datosDemarca;
    private Estante estante;

    public GenerarListadeMarcas(DatosDemarca datosDemarca, Estante estante) {
        Objects.requireNonNull(datosDemarca);
        Objects.requireNonNull(estante);
        this.datosDemarca = datosDemarca;
        this.estante = estante;
    }

    public DatosDemarca getDatosDemarca() {
        return datosDemarca;
    }

    public Estante getEstante() {
        return estante;
    }
}
