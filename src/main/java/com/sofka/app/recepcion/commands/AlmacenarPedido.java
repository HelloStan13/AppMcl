package com.sofka.app.recepcion.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;

public class AlmacenarPedido extends Command {

    private AlmacenamientoId almacenamientoId;
    private PedidoId pedidoId;
    private RecepcionId recepcionId;
    private Estado estado;

    public AlmacenarPedido(AlmacenamientoId almacenamientoId, PedidoId pedidoId, RecepcionId recepcionId, Estado estado){
        this.almacenamientoId = almacenamientoId;
        this.pedidoId = pedidoId;
        this.recepcionId = recepcionId;
        this.estado = estado;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public Estado getEstado() {
        return estado;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
}
