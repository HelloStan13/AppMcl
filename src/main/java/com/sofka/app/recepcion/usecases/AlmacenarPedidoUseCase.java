package com.sofka.app.recepcion.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.app.recepcion.Recepcion;
import com.sofka.app.recepcion.commands.AlmacenarPedido;


public class AlmacenarPedidoUseCase extends UseCase<RequestCommand<AlmacenarPedido>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AlmacenarPedido> input) {
        var command = input.getCommand();
        var recepcion = new Recepcion(command.getRecepcionId(),command.getAlmacenamientoId(), command.getPedidoId(), command.getEstado());
        emit().onResponse(new ResponseEvents(recepcion.getUncommittedChanges()));
    }

}
