package com.sofka.app.personal.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.personal.values.PersonalId;

import java.util.Objects;

public class AsignarPersonal extends Command {
    private PersonalId personalId;

    public AsignarPersonal(PersonalId personalId) {
        Objects.requireNonNull(personalId);
        this.personalId = personalId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}