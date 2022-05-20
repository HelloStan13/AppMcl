package com.sofka.app.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.app.almacenamiento.Almacenamiento;
import com.sofka.app.almacenamiento.commands.DespacharProductos;

public class DespacharProductosporMayorUseCase  extends UseCase<RequestCommand<DespacharProductos>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<DespacharProductos> input) {
        var command = input.getCommand();
        var almacenamiento = new Almacenamiento(command.getAlmacenamientoId(),command.getDespachoAVentaId(), command.getPlanilla());
        emit().onResponse(new ResponseEvents(almacenamiento.getUncommittedChanges()));

    }
}