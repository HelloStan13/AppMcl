package com.sofka.app.recepcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;

public class PedidoRecibido extends DomainEvent {
    private Estado estado;
    private PedidoId pedidoId;
    private RecepcionId recepcionId;
    public PedidoRecibido(RecepcionId recepcionId, AlmacenamientoId almacenamientoId, PedidoId pedidoid, Estado estado) {
        super("com.sofka.app.pedidoRecibido");
    }

    public Estado getEstado() {
        return estado;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }
}
