package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;


public class PersonalEditado extends DomainEvent {
    private DatosPersonales datosPersonales;
    private PersonalId personalId;


    public PersonalEditado(DatosPersonales datosPersonales , PersonalId personalId) {
        super("com.sofka.app.personalEditado");
        this.datosPersonales = datosPersonales;
        this.personalId = personalId;

    }
    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
    public PersonalId getPersonalId() {
        return personalId;
    }
}
