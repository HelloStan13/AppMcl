package com.sofka.app.recepcion.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.app.recepcion.Recepcion;
import com.sofka.app.recepcion.commands.RecibirPedido;


public class RecibirPedidoUseCase extends UseCase<RequestCommand<RecibirPedido>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<RecibirPedido> input) {
        var command = input.getCommand();
        var recepcion = new Recepcion(command.getRecepcionId(), command.getAlmacenamientoId(), command.getPedidoId(), command.getEstado());
        emit().onResponse(new ResponseEvents(recepcion.getUncommittedChanges()));
    }
}
