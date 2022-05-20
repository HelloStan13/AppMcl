package com.sofka.app.personal.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.personal.commands.EditarPersonal;
import com.sofka.app.personal.events.PersonalEditado;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditarPersonalUseCaseTest {

    @Test
    void editarPersonal() {

        //arrange
        PersonalId personalId = new PersonalId();
        DatosPersonales datosPersonales = new DatosPersonales("Adry", "Ynfante", "adry@gmail.com");
        var command = new EditarPersonal(personalId, datosPersonales);
        var usecase = new EditarPersonalUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PersonalEditado) events.get(1);
        Assertions.assertEquals("com.sofka.app.personalEditado", event.type);
        Assertions.assertEquals(personalId.value(), event.aggregateRootId());
        Assertions.assertEquals(personalId.value(), event.getPersonalId().value());
        Assertions.assertNotNull(personalId.value());
    }

}