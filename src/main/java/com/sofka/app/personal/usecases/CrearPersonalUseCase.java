package com.sofka.app.personal.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.app.personal.Personal;
import com.sofka.app.personal.commands.CrearPersonal;


public class CrearPersonalUseCase extends UseCase<RequestCommand<CrearPersonal>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearPersonal> input) {
        var command = input.getCommand();
        var personal = new Personal( command.getDatosPersonales(), command.getPersonalId());
        emit().onResponse(new ResponseEvents(personal.getUncommittedChanges()));
    }
}
