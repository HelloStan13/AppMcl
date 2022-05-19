package com.sofka.app.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.app.personal.entities.Administrador;
import com.sofka.app.personal.entities.AuxiliarBodega;
import com.sofka.app.personal.entities.JefeBodega;
import com.sofka.app.personal.values.*;

public class Personal extends AggregateEvent<PersonalId> {
    protected Administrador administrador;
    protected JefeBodega jefeBodega;
    protected AuxiliarBodega auxiliarBodega;
    protected DatosPersonales datosPersonales;
    protected PersonalId personalId;

    public Personal(PersonalId personalId, DatosPersonales datosPersonales) {
        super(personalId);
    }
}
