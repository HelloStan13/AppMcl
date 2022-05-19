package com.sofka.app.almacenamiento.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.almacenamiento.values.DespachoAVentasId;
import com.sofka.app.almacenamiento.values.Planilla;

import java.util.Objects;

public class ProductoaDespachar extends Command {
    private AlmacenamientoId almacenamientoId;
    private DespachoAVentasId despachoAVentaId;
    private Planilla planilla;

    public ProductoaDespachar(AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId, Planilla planilla) {
        Objects.requireNonNull(almacenamientoId);
        Objects.requireNonNull(despachoAVentaId);
        Objects.requireNonNull(planilla);
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
