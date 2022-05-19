package com.sofka.app.almacenamiento.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.almacenamiento.values.DespachoAVentasId;
import com.sofka.app.almacenamiento.values.Planilla;

import java.util.Objects;


public class DespachoAVentas extends Entity<DespachoAVentasId> {
    private Planilla planilla;

    public DespachoAVentas(DespachoAVentasId despachoAVentasId, Planilla planilla) {
        super(despachoAVentasId);
        this.planilla = planilla;

    }

    //Comportamiento
    public void despacharProductos(Planilla planilla){
        this.planilla = Objects.requireNonNull(planilla);
    }


    //Propiedades

    public Planilla planilla() {
        return planilla;
    }
}
