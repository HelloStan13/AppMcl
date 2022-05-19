package com.sofka.app.almacenamiento.events;

import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DatosDemarca;
import com.sofka.app.almacenamiento.values.Estante;

public class AlmacenadoPormarca extends co.com.sofka.domain.generic.DomainEvent {
    private AlmacenamientoId  almacenamientoId;
    private DatosDemarca datosDemarca;
    private Estante estante;

    public AlmacenadoPormarca(AlmacenamientoId almacenamientoId, DatosDemarca datosDemarca, Estante estante) {
        super("com.sofka.app.almacenadoPormarca");
        this.almacenamientoId = almacenamientoId;
        this.datosDemarca = datosDemarca;
        this.estante = estante;
    }

    public DatosDemarca getDatosDemarca() {
        return datosDemarca;
    }

    public Estante getEstante() {
        return estante;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }
}
