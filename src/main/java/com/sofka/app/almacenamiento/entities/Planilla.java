package com.sofka.app.almacenamiento.entities;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Planilla implements ValueObject<Planilla.Props> {
    private final String nombreEmpeladoDespacho;
    private final Date fecha;
    private final String nombreProductos;
    private final Integer cantidadProductos;

    public Planilla(String nombreEmpeladoDespacho, Date fecha, String nombreProductos, Integer cantidadProductos) {
        Objects.requireNonNull(nombreEmpeladoDespacho);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(nombreProductos);
        Objects.requireNonNull(cantidadProductos);
        this.nombreEmpeladoDespacho = nombreEmpeladoDespacho;
        this.fecha = fecha;
        this.nombreProductos = nombreProductos;
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public Planilla.Props value() {
        return new Props() {
            @Override
            public String nombreEmpeladoDespacho() { return nombreEmpeladoDespacho(); }
            @Override
            public String fecha() { return fecha(); }
            @Override
            public String nombreProductos() { return nombreProductos(); }
            @Override
            public String cantidadProductos() { return cantidadProductos(); }

        };

    }

    public interface Props {
        String fecha();
        String nombreProductos();
        String nombreEmpeladoDespacho();
        String cantidadProductos();
    }
}
