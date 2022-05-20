package com.sofka.app.personal.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.personal.commands.CrearPersonal;
import com.sofka.app.personal.events.PersonalCreado;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CrearPersonalUseCaseTest {
    @Test
    void crearPersonal(){
        //arrange
        PersonalId personalId = new PersonalId();
        DatosPersonales datosPersonales = new DatosPersonales("Adryan", "Ynfante", "adryanynfante@gmail.com");
        var command = new CrearPersonal(personalId, datosPersonales);
        var usecase = new CrearPersonalUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (PersonalCreado)events.get(0);
        Assertions.assertEquals("com.sofka.app.personalCreado", event.type);
        Assertions.assertEquals(personalId.value(),event.aggregateRootId());
    }
}