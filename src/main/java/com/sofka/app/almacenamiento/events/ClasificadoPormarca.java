package com.sofka.app.almacenamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DatosDemarca;
import com.sofka.app.almacenamiento.values.Estante;

public class ClasificadoPormarca extends DomainEvent {
    private AlmacenamientoId  almacenamientoId;
    private DatosDemarca datosDemarca;

    public ClasificadoPormarca(AlmacenamientoId almacenamientoId, DatosDemarca datosDemarca, Estante estante) {
        super("com.sofka.app.clasificadoPormarca");
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
