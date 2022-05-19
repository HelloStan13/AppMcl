package com.sofka.app.almacenamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DespachoAVentasId;
import com.sofka.app.almacenamiento.values.Planilla;

public class ProductosDespachados extends DomainEvent {
    private AlmacenamientoId almacenamientoId;
    private DespachoAVentasId despachoAVentaId;
    private Planilla planilla;

    public ProductosDespachados( AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId,Planilla planilla ) {
        super("com.sofka.app.productosDespachados");
        this.almacenamientoId = almacenamientoId;
        this.despachoAVentaId = despachoAVentaId;
        this.planilla = planilla;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public DespachoAVentasId getDespachoAVentaId() {
        return despachoAVentaId;
    }

    public Planilla getPlanilla() {
        return planilla;
    }
}
