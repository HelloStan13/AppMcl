package com.sofka.app.personal.values;

import co.com.sofka.domain.generic.Identity;

public class PersonalId extends Identity {

    private  PersonalId(String valor){
        super(valor);
    }

    public PersonalId(){}

    public static PersonalId of(String valor) {
        return new PersonalId(valor);
    }
}
