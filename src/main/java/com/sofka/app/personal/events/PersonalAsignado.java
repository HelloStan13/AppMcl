package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;

public class PersonalAsignado extends DomainEvent {
    private PersonalId personalId;
    private DatosPersonales datosPersonales;

    public PersonalAsignado(PersonalId personalId, DatosPersonales datosPersonales) {
        super("com.sofka.app.personalAsignado");
        this.personalId = personalId;

    }
    public PersonalId getPersonalId() {
        return personalId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
