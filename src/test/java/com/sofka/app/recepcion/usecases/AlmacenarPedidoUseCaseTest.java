package com.sofka.app.recepcion.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.commands.AlmacenarPedido;
import com.sofka.app.recepcion.events.PedidoAlmacenado;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmacenarPedidoUseCaseTest {
    @Test
    void almacenarPedido(){
        //arrange
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        RecepcionId recepcionId = new RecepcionId();
        PedidoId pedidoId = new PedidoId();
        Estado estado = new Estado(Estado.Fase.PEDIDO_ALMACENADO);

        var command = new AlmacenarPedido(almacenamientoId, pedidoId, recepcionId, estado);
        var usecase = new AlmacenarPedidoUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (PedidoAlmacenado)events.get(1);
        Assertions.assertEquals("sofka.farmacia.pedidoalmacenado", event.type);
        Assertions.assertEquals(recepcionId.value(), event.aggregateRootId());
        Assertions.assertNotNull(pedidoId);
    }

}