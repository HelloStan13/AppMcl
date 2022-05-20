package com.sofka.app.recepcion.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.commands.RecibirPedido;
import com.sofka.app.recepcion.events.PedidoRecibido;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.ProveedorId;
import com.sofka.app.recepcion.values.RecepcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecibirPedidoUseCaseTest {

    @Test
    void recibirPedidotest(){
        //arrange
        RecepcionId recepcionId = new RecepcionId();
        PedidoId pedidoId = PedidoId.of("Golty 1");
        ProveedorId proveedorId = new ProveedorId();
        Estado estado = new Estado(Estado.Fase.CHEQUEODE_PEDIDO);
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();

        var command = new RecibirPedido(pedidoId, almacenamientoId, recepcionId, estado);
        var usecase = new RecibirPedidoUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PedidoRecibido)events.get(0);
        Assertions.assertEquals("com.sofka.app.pedidoRecibido", event.type);
        Assertions.assertEquals(recepcionId.value(), event.aggregateRootId());

    }


}