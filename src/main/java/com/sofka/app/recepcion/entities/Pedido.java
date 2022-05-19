package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.FechaRecibido;

public class Pedido extends Entity<PedidoId> {
    private Estado estado;
    private FechaRecibido fechaRecibido;
    public Pedido(PedidoId pedidoId) {
        super(pedidoId);
    }
}
