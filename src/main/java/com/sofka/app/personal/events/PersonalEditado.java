package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;

public class PersonalEditado extends DomainEvent {
    private DatosPersonales datosPersonales;
    private PersonalId personalId;
    public PersonalEditado(PersonalId personalId, DatosPersonales datosPersonales) {
        super("com.sofka.app.PersonalEditado");
        this.personalId = personalId;
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
