package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;


public class PersonalCreado extends DomainEvent {
    private DatosPersonales datosPersonales;
    private PersonalId personalId;

    public PersonalCreado(DatosPersonales datosPersonales, PersonalId personalId) {
        super("com.sofka.app.personalCreado");
    }
    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
    public PersonalId getPersonalId() {
        return personalId;
    }
}
