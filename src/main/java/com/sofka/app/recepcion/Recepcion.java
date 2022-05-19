package com.sofka.app.recepcion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.app.almacenamiento.values.AlmacenamientoId;
import com.sofka.app.personal.values.PersonalId;
import com.sofka.app.recepcion.entities.Inventario;
import com.sofka.app.recepcion.entities.Pedido;
import com.sofka.app.recepcion.entities.Proveedor;
import com.sofka.app.recepcion.values.RecepcionId;

import java.util.List;

public class Recepcion extends AggregateEvent<RecepcionId> {
    protected RecepcionId recepcionId;
    private PersonalId personalId;
    private AlmacenamientoId almacenamientoId;
    private Inventario inventario;
    private List<Proveedor> proovedor;
    private Pedido pedido;
    private PedidoId pedidoId;

    public Recepcion(RecepcionId recepcionId) {
        super(recepcionId);
    }
}
