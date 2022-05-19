package com.sofka.app.recepcion;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.app.recepcion.events.ContenidoVerificado;
import com.sofka.app.recepcion.events.PedidoAlmacenado;
import com.sofka.app.recepcion.events.PedidoRecibido;

public class RecepcionChange extends EventChange {
    public RecepcionChange(Recepcion recepcion){
        apply((ContenidoVerificado event) ->{
            recepcion.verificarContenido(event.getAlmacenamientoId(), event.getRecepcionId(), event.getPedidoId(), event.getEstado());
        });

        apply((PedidoAlmacenado event) -> {
            recepcion.almacenarPedido(event.getAlmacenamientoId(), event.getRecepcionId(), event.getPedidoId(),event.getEstado());
        });

        apply((PedidoRecibido event) ->{
            recepcion.recibirPedido(event.getRecepcionId(),event.getPedidoId(),event.getEstado());
        });
    }
}
