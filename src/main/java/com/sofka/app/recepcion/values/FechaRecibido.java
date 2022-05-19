package com.sofka.app.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class FechaRecibido implements ValueObject<LocalDate> {
    private final LocalDate fechaRecibido;

    public FechaRecibido(LocalDate fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    @Override
    public LocalDate value() {
        return fechaRecibido;
    }

}
