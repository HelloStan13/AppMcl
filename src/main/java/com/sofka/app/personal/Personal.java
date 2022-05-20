package com.sofka.app.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.app.personal.entities.Administrador;
import com.sofka.app.personal.entities.AuxiliarBodega;
import com.sofka.app.personal.entities.JefeBodega;
import com.sofka.app.personal.events.PersonalCreado;
import com.sofka.app.personal.events.PersonalEditado;
import com.sofka.app.personal.events.PersonalEliminado;
import com.sofka.app.personal.values.DatosPersonales;
import com.sofka.app.personal.values.PersonalId;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Personal extends AggregateEvent<PersonalId> {
    public ArrayList<Object> eliminarPersonal;
    protected Administrador administrador;
    protected JefeBodega jefeBodega;
    protected AuxiliarBodega auxiliarBodega;
    protected DatosPersonales datosPersonales;
    protected PersonalId personalId;

    public Personal(DatosPersonales datosPersonales, PersonalId personalId) {
        super(personalId);
        appendChange(new PersonalCreado(datosPersonales, personalId )).apply();
        appendChange(new PersonalEditado(datosPersonales, personalId )).apply();
    }


    public Personal(PersonalId personalId) {
        super(personalId);
        subscribe(new PersonalChange(this));
    }

    public static Personal from(PersonalId personalId, List<DomainEvent> events){
        var personal = new Personal(personalId);
        events.forEach(personal::applyEvent);
        return personal;
    }

    //Comportamientos
    public void agregarPersonal(DatosPersonales datosPersonales, PersonalId personalId) {
        Objects.requireNonNull(personalId);
        Objects.requireNonNull(datosPersonales);
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply();
    }

    public void editarPersonal(DatosPersonales datosPersonales, PersonalId personalId) {
        appendChange(new PersonalEditado(datosPersonales, personalId)).apply();
    }
    public void eliminarPersonal(PersonalId personalId) {
        appendChange(new PersonalEliminado(personalId)).apply();
    }


}
