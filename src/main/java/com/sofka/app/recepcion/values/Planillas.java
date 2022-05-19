package com.sofka.app.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Planillas implements ValueObject<Integer> {
    private final Integer numeroPlanilla;

    public Planillas(Integer numeroPlanilla) {
        Objects.requireNonNull(numeroPlanilla);
        this.numeroPlanilla = numeroPlanilla;
    }
    @Override
    public Integer value() {
        return numeroPlanilla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planillas)) return false;
        Planillas planillas = (Planillas) o;
        return numeroPlanilla.equals(planillas.numeroPlanilla);
    }

}
