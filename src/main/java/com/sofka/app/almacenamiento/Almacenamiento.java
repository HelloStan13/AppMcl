package com.sofka.app.almacenamiento;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.entities.DespachoAVentas;
import com.sofka.app.almacenamiento.entities.DespachoAVentasporMayor;
import com.sofka.app.almacenamiento.entities.Marca;
import com.sofka.app.almacenamiento.events.AlmacenadoPormarca;
import com.sofka.app.almacenamiento.events.ClasificadoPormarca;
import com.sofka.app.almacenamiento.events.ProductosDespachados;
import com.sofka.app.almacenamiento.events.ProductosDespachadosporMayor;
import com.sofka.app.almacenamiento.values.*;
import com.sofka.app.personal.Personal;
import com.sofka.app.personal.values.PersonalId;

import java.util.List;

public class Almacenamiento  extends AggregateEvent<AlmacenamientoId> {
    protected DespachoAVentas despachoAVentas;
    protected DespachoAVentasporMayor despachoAVentasporMayor;
    protected List<Marca> marca;

    public Almacenamiento(AlmacenamientoId almacenamientoId, DespachoAVentas despachoAVentas,DespachoAVentasporMayor despachoAVentasporMayor, DatosDemarca datosDemarca, Estante estante) {
        super(almacenamientoId);
        appendChange(new AlmacenadoPormarca(almacenamientoId, datosDemarca, estante)).apply();
    }
    public Almacenamiento(AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId, Planilla planilla) {
        super(almacenamientoId);
        appendChange(new ProductosDespachados(almacenamientoId, despachoAVentaId, planilla)).apply();
    }
    public Almacenamiento(AlmacenamientoId almacenamientoId, DatosDemarca datosDemarca, Estante estante) {
        super(almacenamientoId);
    }

    public Almacenamiento(AlmacenamientoId almacenamientoId) {
        super(almacenamientoId);
    }

    public static Almacenamiento from(AlmacenamientoId almacenamientoId, List<DomainEvent> events){
        var almacenamiento = new Almacenamiento(almacenamientoId);
        events.forEach(almacenamiento::applyEvent);
        return almacenamiento;
    }
    //comportamientos
    public void almacenarPormarca(AlmacenamientoId almacenamientoId, DatosDemarca datosDemarca, Estante estante){
        appendChange(new AlmacenadoPormarca(almacenamientoId, datosDemarca, estante)).apply();
    }
    public void clasificarPormarca(AlmacenamientoId almacenamientoId, DatosDemarca datosDemarca, Estante estante){
        appendChange(new ClasificadoPormarca(almacenamientoId, datosDemarca, estante)).apply();
    }
    public void productoaDespachar(AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId, Planilla planilla ){
        appendChange(new ProductosDespachados(almacenamientoId, despachoAVentaId, planilla)).apply();
    }
    public void productoaDespacharporMayor(AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId, Planilla planilla ){
        appendChange(new ProductosDespachadosporMayor(almacenamientoId, despachoAVentaId, planilla)).apply();
    }
}
