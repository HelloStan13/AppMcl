package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;


public class PersonalCreado extends DomainEvent {
    private PersonalId personalId;
    private DatosPersonales datosPersonales;


    public PersonalCreado(PersonalId personalId, DatosPersonales datosPersonales) {
        super("com.sofka.app.personalCreado");
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }


}
