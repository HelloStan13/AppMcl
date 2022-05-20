package com.sofka.app.recepcion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.personal.values.PersonalId;
import com.sofka.app.recepcion.entities.Inventario;
import com.sofka.app.recepcion.entities.Pedido;
import com.sofka.app.recepcion.entities.Proveedor;
import com.sofka.app.recepcion.events.ContenidoVerificado;
import com.sofka.app.recepcion.events.PedidoAlmacenado;
import com.sofka.app.recepcion.events.PedidoFinalizado;
import com.sofka.app.recepcion.events.PedidoRecibido;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.RecepcionId;

import java.util.List;
import java.util.Objects;

public class Recepcion extends AggregateEvent<RecepcionId> {
    protected RecepcionId recepcionId;
    private PersonalId personalId;
    private AlmacenamientoId almacenamientoId;
    private Inventario inventario;
    private List<Proveedor> proovedor;
    private Pedido pedido;
    private PedidoId pedidoId;
    private Estado estado;

    public Recepcion(RecepcionId recepcionId, AlmacenamientoId almacenamientoId, PedidoId pedidoId, Estado estado) {
        super(recepcionId);
        appendChange(new PedidoRecibido(recepcionId, almacenamientoId, pedidoId, estado)).apply();
        appendChange(new PedidoAlmacenado(almacenamientoId,recepcionId,pedidoId,estado)).apply();
        appendChange(new ContenidoVerificado(recepcionId, almacenamientoId, pedidoId, estado));
    }

    public Recepcion(RecepcionId recepcionId) {
        super(recepcionId);
    }

    public static Recepcion from(RecepcionId recepcionId, List<DomainEvent>events){
        var recepcion = new Recepcion(recepcionId);
        events.forEach(recepcion::applyEvent);
        return recepcion;
    }

    //Comportamientos
    public void recibirPedido(RecepcionId recepcionId, PedidoId pedidoid, Estado estado){
        appendChange(new PedidoRecibido(recepcionId, almacenamientoId, pedidoid,estado)).apply();
    }

    public void verificarContenido(AlmacenamientoId almacenamientoId, RecepcionId recepcionId, PedidoId pedidoId, Estado estado){
        appendChange(new ContenidoVerificado( recepcionId, almacenamientoId, pedidoId, estado)).apply();
    }
    public void almacenarPedido(AlmacenamientoId almacenamientoId,RecepcionId recepcionId, PedidoId pedidoId, Estado estado){
        Objects.requireNonNull(almacenamientoId);
        appendChange(new PedidoAlmacenado(almacenamientoId, recepcionId, pedidoId,estado)).apply();
    }
    public void finalizarPedido(Pedido pedido){
        appendChange(new PedidoFinalizado(pedido, estado)).apply();
    }




}
