package com.sofka.app.almacenamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.almacenamiento.values.DatosDemarca;
import com.sofka.app.almacenamiento.values.Estante;

public class ListadeMarcasGenerada  extends DomainEvent  {
    private DatosDemarca datosDemarca;
    private Estante estante;

    public ListadeMarcasGenerada(DatosDemarca datosDemarca,Estante estante) {
        super("com.sofka.app.listadeMarcasGenerada");
    }

    public DatosDemarca getDatosDemarca() {
        return datosDemarca;
    }

    public Estante getEstante() {
        return estante;
    }
}
