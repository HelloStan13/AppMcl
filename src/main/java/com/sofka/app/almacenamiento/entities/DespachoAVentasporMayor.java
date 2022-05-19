package com.sofka.app.almacenamiento.entities;

import co.com.sofka.domain.generic.Entity;

import com.sofka.app.almacenamiento.values.DespachoAVentasporMayorId;
import com.sofka.app.almacenamiento.values.Planilla;

import java.util.Objects;

public class DespachoAVentasporMayor  extends Entity<DespachoAVentasporMayorId> {
    private Planilla planilla;
    public DespachoAVentasporMayor(DespachoAVentasporMayorId despachoAVentasporMayorId, Planilla planilla) {
        super(despachoAVentasporMayorId);
        this.planilla = planilla;
    }

    //Comportamiento
    public void despacharProductosVentaspormayor(Planilla planilla){
        this.planilla = Objects.requireNonNull(planilla);
    }

    //Propiedades

    public Planilla planilla() {
        return planilla;
    }
}
