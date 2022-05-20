package com.sofka.app.personal.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.app.personal.Personal;
import com.sofka.app.personal.commands.AsignarPersonal;
import com.sofka.app.personal.values.DatosPersonales;

public class AsignarPersonalUseCase extends UseCase<RequestCommand<AsignarPersonal>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsignarPersonal> habilitarPersonalRequestCommand) {
        var command = habilitarPersonalRequestCommand.getCommand();
        var datosPersona= new DatosPersonales("Ingrid","Bedoya", "ib@gmail.com");
        var personal = new Personal(datosPersona, command.getPersonalId());
        emit().onResponse(new ResponseEvents(personal.getUncommittedChanges()));
    }
}