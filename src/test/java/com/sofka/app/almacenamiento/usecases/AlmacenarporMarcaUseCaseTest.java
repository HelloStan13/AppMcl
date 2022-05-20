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

import static org.junit.jupiter.api.Assertions.*;

class AlmacenarporMarcaUseCaseTest {
    @Test
    void almacenarPorMarca(){
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        MarcaId marcaId = new MarcaId();
        DatosDemarca datosDemarca = new DatosDemarca("Golty");
        Estante estante = new Estante(1);

        var command = new AlmacenarPormarca(almacenamientoId, datosDemarca, estante);
        var because= new AlmacenarporMarcaUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(because, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AlmacenadoPormarca)events.get(1);
        Assertions.assertEquals("com.sofka.app.almacenadoPormarca", event.type);
        Assertions.assertEquals(almacenamientoId.value(), event.aggregateRootId());




    }

}