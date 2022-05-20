package com.sofka.app.recepcion.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.recepcion.values.PedidoId;
import com.sofka.app.recepcion.values.Estado;
import com.sofka.app.recepcion.values.FechaRecibido;

public class Pedido extends Entity<PedidoId> {
    private Estado estado;
    private FechaRecibido fechaRecibido;

    public Pedido(PedidoId pedidoId) {
        super(pedidoId);
        this.estado = new Estado(Estado.Fase.CHEQUEODE_PEDIDO);
        this.fechaRecibido = fechaRecibido;
    }

    //Comportamientos

    public void solicitarPedido(Estado estado) {
        this.estado = new Estado(Estado.Fase.SOLICITAR_PEDIDO);
    }

    public void verificarContenido(Estado estado, FechaRecibido fechaRecibido) {
        this.estado = new Estado(Estado.Fase.CHEQUEODE_PEDIDO);
        this.fechaRecibido = fechaRecibido;
    }
    public void pedidoAceptado(Estado estado){
        this.estado = new Estado(Estado.Fase.PEDIDO_ACEPTADO);
    }

    public void rechazarPedido(Estado estado){
        this.estado = new Estado(Estado.Fase.PEDIDO_RECHAZADO);
    }

    public void devolverPedido(Estado estado){
        this.estado = new Estado(Estado.Fase.PEDIDO_DEVUELTO);
    }

    //Propiedades

    public Estado estado() {
        return estado;
    }

    public FechaRecibido fechaRecibido() {
        return fechaRecibido;
    }
}


