package com.sofka.app.almacenamiento;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.app.almacenamiento.entities.DespachoAVentas;
import com.sofka.app.almacenamiento.entities.DespachoAVentasporMayor;
import com.sofka.app.almacenamiento.entities.Marca;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;

import java.util.List;

public class Almacenamiento  extends AggregateEvent<AlmacenamientoId> {
    protected DespachoAVentas despachoAVentas;
    protected DespachoAVentasporMayor despachoAVentasporMayor;
    protected List<Marca> marca;

    public Almacenamiento(AlmacenamientoId almacenamientoId) {
        super(almacenamientoId);
    }
}
