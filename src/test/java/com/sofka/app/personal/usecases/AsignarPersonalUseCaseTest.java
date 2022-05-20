package com.sofka.app.personal.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.personal.events.PersonalAsignado;
import com.sofka.app.personal.commands.AsignarPersonal;
import com.sofka.app.personal.values.PersonalId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AsignarPersonalUseCaseTest {

    @Test
    void AsignarPersonal(){
        //arrange:
        PersonalId personalId = new PersonalId();
        var command = new AsignarPersonal(personalId);
        var usecase = new AsignarPersonalUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event =(PersonalAsignado)events.get(0);
        Assertions.assertEquals("com.sofka.app.personalAsignado", event.type);
        Assertions.assertEquals(personalId.value(), event.aggregateRootId());
    }

}