package com.sofka.app.personal.values;

import co.com.sofka.domain.generic.Identity;

public class JefeBodegaId extends Identity {
    private JefeBodegaId(String id){
        super(id);
    }

    public JefeBodegaId(){}

    public static JefeBodegaId of(String id) {
        return new JefeBodegaId(id);
    }
}

