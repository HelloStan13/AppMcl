package com.sofka.app.almacenamiento.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.almacenamiento.values.DespachoAVentasId;


public class DespachoAVentas extends Entity<DespachoAVentasId> {
    private Planilla planilla;

    public DespachoAVentas(DespachoAVentasId despachoAVentasId, Planilla planilla) {
        super(despachoAVentasId);
        this.planilla = planilla;

    }

    //Comportamientos


    //Propiedades

    public Planilla planilla() {
        return planilla;
    }
}
