package com.sofka.app.recepcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;

public class ContenidoVerificado extends DomainEvent {

    private final Estado estado;
    private final PedidoId pedidoId;
    private final RecepcionId recepcionId;
    private final AlmacenamientoId almacenamientoId;


    public ContenidoVerificado(RecepcionId recepcionId, AlmacenamientoId almacenamientoId, PedidoId pedidoId, Estado estado) {
        super("com.sofka.app.contenidoVerificado");
        this.recepcionId = recepcionId;
        this.almacenamientoId = almacenamientoId;
        this.pedidoId = pedidoId;
        this.estado = estado;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public Estado getEstado() {
        return estado;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
}
