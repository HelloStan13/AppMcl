package com.sofka.app.recepcion.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.recepcion.commands.VerificarContenido;
import com.sofka.app.recepcion.events.ContenidoVerificado;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class VerificarContenidoUseCaseTest {
    @Test
    void verificarContenido(){
        //arrange
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        RecepcionId recepcionId = new RecepcionId();
        PedidoId pedidoId = new PedidoId();
        Estado estado = new Estado(Estado.Fase.CHEQUEODE_PEDIDO);

        var command = new VerificarContenido(almacenamientoId, recepcionId,pedidoId,estado);
        var usecase = new VerificarContenidoUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ContenidoVerificado)events.get(2);
        Assertions.assertEquals("com.sofka.app.contenidoVerificado", event.type);
        Assertions.assertEquals(recepcionId.value(), event.aggregateRootId());
        Assertions.assertNotNull(pedidoId);
    }

}