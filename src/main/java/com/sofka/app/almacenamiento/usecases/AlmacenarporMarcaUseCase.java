package com.sofka.app.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.sofka.app.almacenamiento.Almacenamiento;
import com.sofka.app.almacenamiento.commands.AlmacenarPormarca;

public class AlmacenarporMarcaUseCase  extends UseCase<RequestCommand<AlmacenarPormarca>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AlmacenarPormarca> input) {
        var command = input.getCommand();
        var almacenamiento = new Almacenamiento(command.almacenamientoId(), command.datosDemarca(), command.estante());
        emit().onResponse(new ResponseEvents(almacenamiento.getUncommittedChanges()));
    }
}
