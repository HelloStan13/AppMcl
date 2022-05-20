package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.values.PersonalId;

public class PersonalAsignado extends DomainEvent {
    private PersonalId personalId;
    public PersonalAsignado(PersonalId personalId) {
        super("com.sofka.app.personalAsignado");
        this.personalId = personalId;

    }
    public PersonalId getPersonalId() {
        return personalId;
    }
}
