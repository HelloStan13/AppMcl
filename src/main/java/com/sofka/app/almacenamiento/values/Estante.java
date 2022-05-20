package com.sofka.app.almacenamiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estante implements ValueObject<Integer> {

    private final Integer estante;

    public Estante(Integer estante) {
        this.estante = Objects.requireNonNull(estante);
    }

    @Override
    public Integer value() {
        return estante;
    }
}
