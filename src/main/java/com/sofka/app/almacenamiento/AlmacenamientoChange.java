package com.sofka.app.almacenamiento;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.app.almacenamiento.events.AlmacenadoPormarca;
import com.sofka.app.almacenamiento.events.ListadeMarcasGenerada;
import com.sofka.app.almacenamiento.events.ProductosDespachados;
import com.sofka.app.almacenamiento.events.ProductosDespachadosporMayor;

public class AlmacenamientoChange  extends EventChange {
    public AlmacenamientoChange(Almacenamiento almacenamiento) {
        apply((AlmacenadoPormarca event) -> {
            almacenamiento.despachoAVentas = null;
            almacenamiento.marca = null;
        });
        apply((ProductosDespachados event ) -> {
            almacenamiento.productoaDespachar(event.getAlmacenamientoId(),event.getDespachoAVentaId(), event.getPlanilla());
        });
        apply((ProductosDespachadosporMayor event ) -> {
            almacenamiento.productoaDespachar(event.getAlmacenamientoId(),event.getDespachoAVentaId(), event.getPlanilla());
        });

        apply((ListadeMarcasGenerada event)->{
            almacenamiento.marca = null;
        });

    }
}
