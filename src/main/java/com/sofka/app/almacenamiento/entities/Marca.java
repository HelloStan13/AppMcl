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
    public void clasificarPormarca(MarcaId marcaId, DatosDemarca datosDemarca, Estante estante ){
        this.marcaId = marcaId;
        this.datosDemarca = datosDemarca;
        this.estante = estante;
    }
    public void crearNuevosEstantes(DatosDemarca datosDemarca, Estante estante){
        this.datosDemarca = datosDemarca;
        this.estante = estante;
    }

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
