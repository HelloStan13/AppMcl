package com.sofka.app.personal.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.app.personal.Personal;
import com.sofka.app.personal.commands.EditarPersonal;


public class EditarPersonalUseCase extends UseCase<RequestCommand<EditarPersonal>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<EditarPersonal> personalEditadoRequestCommand) {
        var command = personalEditadoRequestCommand.getCommand();
        var personal = new Personal(command.getPersonalId(), command.getDatosPersonales());
        emit().onResponse(new ResponseEvents(personal.getUncommittedChanges()));
    }
}
