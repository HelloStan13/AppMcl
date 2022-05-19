package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;


public class PersonalEditado extends DomainEvent {
    private PersonalId personalId;
    private DatosPersonales datosPersonales;

    public PersonalEditado(PersonalId personalId, DatosPersonales datosPersonales) {
        super("com.sofka.app.personalEditado");
        this.personalId = personalId;
        this.datosPersonales = datosPersonales;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }


}
