package com.sofka.app.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.almacenamiento.commands.AlmacenarPormarca;
import com.sofka.app.almacenamiento.events.AlmacenadoPormarca;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DatosDemarca;
import com.sofka.app.almacenamiento.values.Estante;
import com.sofka.app.almacenamiento.values.MarcaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AlmacenarporMarcaUseCaseTest {
    @Test
    void almacenarPorMarca(){
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        DatosDemarca datosDemarca = new DatosDemarca("Molten");
        Estante estante = new Estante(5);

        var command = new AlmacenarPormarca(almacenamientoId, datosDemarca, estante);
        var usecase= new AlmacenarporMarcaUseCase();
        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (AlmacenadoPormarca)events.get(0);
        Assertions.assertEquals("com.sofka.app.almacenadopormarca", event.type);
        Assertions.assertEquals(almacenamientoId.value(),event.aggregateRootId());

    }

}