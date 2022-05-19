package com.sofka.app.personal.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.sofka.app.personal.values.PersonalId;

public class PersonalEliminado extends DomainEvent {
    private PersonalId personalId;


    public PersonalEliminado(PersonalId personalId) {
        super("com.sofka.app.personalEliminado");
        this.personalId = personalId;

    }

    public PersonalId getPersonalId() {
        return personalId;
    }


}
