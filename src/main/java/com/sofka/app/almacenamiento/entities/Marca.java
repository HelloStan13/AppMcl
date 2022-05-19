package com.sofka.app.almacenamiento.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.app.almacenamiento.values.DatosDemarca;
import com.sofka.app.almacenamiento.values.Estante;
import com.sofka.app.almacenamiento.values.MarcaId;

public class Marca extends Entity<MarcaId> {
    private MarcaId marcaId;
    private DatosDemarca datosDemarca;
    private Estante estante;

    public Marca(MarcaId marcaId, DatosDemarca datosDemarca, Estante estante) {
        super(marcaId);
        this.datosDemarca = datosDemarca;
        this.estante = estante;
    }

    //comportamientos


    //Propiedades

    public DatosDemarca datosDemarca() {
        return datosDemarca;
    }

    public Estante estante() {
        return estante;
    }

    public MarcaId marcaId() {
        return marcaId;
    }
}
