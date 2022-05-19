package com.sofka.app.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Estado.Fase> {
    private final Fase value;
    public Estado(Fase value){
        this.value = value;
    }

    @Override
    public Fase value() {
        return value;
    }

    public enum Fase {
        CHEQUEODE_PEDIDO, PEDIDO_RECHAZADO, PEDIDO_DEVUELTO,SOLICITAR_PEDIDO, PEDIDO_ACEPTADO, PEDIDO_ALMACENADO

    }
}
