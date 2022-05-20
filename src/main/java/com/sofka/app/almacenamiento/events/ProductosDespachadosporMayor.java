package com.sofka.app.almacenamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DespachoAVentasId;
import com.sofka.app.almacenamiento.values.Planilla;

public class ProductosDespachadosporMayor extends DomainEvent {
    private AlmacenamientoId almacenamientoId;
    private DespachoAVentasId despachoAVentaId;
    private Planilla planilla;

    public ProductosDespachadosporMayor( AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId,Planilla planilla ) {
        super("com.sofka.app.productosDespachadosporMayor");
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
