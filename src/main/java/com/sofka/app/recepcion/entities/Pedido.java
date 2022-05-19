package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.recepcion.PedidoId;

public class Pedido extends Entity<PedidoId> {
    public Pedido(PedidoId pedidoId) {
        super(pedidoId);
    }
}
