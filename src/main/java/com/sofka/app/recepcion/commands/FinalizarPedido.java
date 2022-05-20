package com.sofka.app.recepcion.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.recepcion.entities.Pedido;
import com.sofka.app.recepcion.values.Estado;

public class FinalizarPedido  extends Command {
    private Pedido pedido;
    private Estado estado;

    public FinalizarPedido(Pedido pedido, Estado estado) {
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
