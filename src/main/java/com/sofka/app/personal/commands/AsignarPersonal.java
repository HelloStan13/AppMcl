package com.sofka.app.personal.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;

import java.util.Objects;

public class AsignarPersonal extends Command {
    private PersonalId personalId;
    private DatosPersonales datosPersonales;

    public AsignarPersonal(PersonalId personalId, DatosPersonales datosPersonales) {
        Objects.requireNonNull(personalId);
        this.personalId = personalId;
        this.datosPersonales = datosPersonales;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}