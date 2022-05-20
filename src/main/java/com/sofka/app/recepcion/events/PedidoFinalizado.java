package com.sofka.app.recepcion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.recepcion.entities.Pedido;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.FechaRecibido;
import com.sofka.app.recepcion.values.RecepcionId;

public class PedidoFinalizado extends DomainEvent {
    private Pedido pedido;
    private Estado estado;

    public PedidoFinalizado(Pedido pedido, Estado estado) {
        super("com.sofka.app.pedidoFinalizado");
        this.pedido = pedido;
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Estado getEstado() {
        return estado;
    }
}
