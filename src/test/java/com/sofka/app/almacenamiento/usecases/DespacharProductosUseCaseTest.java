package com.sofka.app.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.app.almacenamiento.commands.DespacharProductos;
import com.sofka.app.almacenamiento.events.ProductosDespachados;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DespachoAVentasId;
import com.sofka.app.almacenamiento.values.Planilla;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DespacharProductosUseCaseTest {
    @Test
    void despacharProductos() {
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        DespachoAVentasId despachoAVentaId = new DespachoAVentasId();
        Planilla planilla = new Planilla("Adryan", new Date(), "Balón Golty", 5);

        var command = new DespacharProductos(almacenamientoId, despachoAVentaId, planilla);
        var usecase = new DespacharProductosUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (ProductosDespachados)events.get(0);
        Assertions.assertEquals("com.sofka.app.productosDespachados", event.type);
    }
}