package com.sofka.app.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.app.almacenamiento.Almacenamiento;
import com.sofka.app.almacenamiento.commands.DespacharProductos;
import com.sofka.app.almacenamiento.events.ProductosDespachados;
import com.sofka.app.almacenamiento.events.ProductosDespachadosporMayor;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DespachoAVentasId;
import com.sofka.app.almacenamiento.values.Planilla;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;


class DespacharProductosporMayorUseCaseTest {
    @Test
    void despacharProductosporMayor() {
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        DespachoAVentasId despachoAVentaId = new DespachoAVentasId();
        Planilla planilla = new Planilla("Adryan", new Date(), "Balón Golty", 5);

        var command = new DespacharProductos(almacenamientoId, despachoAVentaId, planilla);
        var usecase = new DespacharProductosporMayorUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (ProductosDespachadosporMayor)events.get(0);
        Assertions.assertEquals("com.sofka.app.productosDespachadosporMayor", event.type);
    }
}