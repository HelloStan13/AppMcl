package com.sofka.app.recepcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;

public class PedidoAlmacenado extends DomainEvent {

    private final AlmacenamientoId almacenamientoId;
    private final PedidoId pedidoId;
    private final Estado estado;
    private final RecepcionId recepcionId;

    public PedidoAlmacenado(AlmacenamientoId almacenamientoId, RecepcionId recepcionId,PedidoId pedidoId,  Estado estado) {
        super("sofka.farmacia.pedidoalmacenado");
        this.almacenamientoId = almacenamientoId;
        this.pedidoId = pedidoId;
        this.estado = estado;
        this.recepcionId = recepcionId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public Estado getEstado() {
        return estado;
    }
}