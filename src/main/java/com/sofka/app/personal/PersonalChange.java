package com.sofka.app.personal;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.app.personal.events.PersonalCreado;
import com.sofka.app.personal.events.PersonalEditado;
import com.sofka.app.personal.events.PersonalEliminado;

import java.util.function.Predicate;


public class PersonalChange extends EventChange {
    public PersonalChange(Personal personal) {
        apply((PersonalCreado event) -> {
            personal.administrador = null;
            personal.jefeBodega = null;
            personal.auxiliarBodega = null;
        });
        apply((PersonalEditado event) -> {
            personal.editarPersonal(event.getPersonalId(), event.getDatosPersonales());
        });
        apply((PersonalEliminado event)->{
           personal.eliminarPersonal.removeIf((Predicate<? super Object>) event.getPersonalId());
        });
    }
}
