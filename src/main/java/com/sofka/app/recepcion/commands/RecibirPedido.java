package com.sofka.app.recepcion.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;

public class RecibirPedido extends Command {

    private PedidoId pedidoId;
    private RecepcionId recepcionId;
    private Estado estado;
    private AlmacenamientoId almacenamientoId;

    public RecibirPedido(PedidoId pedidoId, AlmacenamientoId almacenamientoId, RecepcionId recepcionId, Estado estado){
        this.pedidoId = pedidoId;
        this.recepcionId = recepcionId;
        this.estado = estado;
        this.almacenamientoId= almacenamientoId;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public Estado getEstado() {
        return estado;
    }
}
