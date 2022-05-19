package com.sofka.app.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.app.personal.entities.Administrador;
import com.sofka.app.personal.entities.AuxiliarBodega;
import com.sofka.app.personal.entities.JefeBodega;
import com.sofka.app.personal.events.PersonalCreado;
import com.sofka.app.personal.events.PersonalEditado;
import com.sofka.app.personal.values.*;

import java.util.Objects;

public class Personal extends AggregateEvent<PersonalId> {
    protected Administrador administrador;
    protected JefeBodega jefeBodega;
    protected AuxiliarBodega auxiliarBodega;
    protected DatosPersonales datosPersonales;
    protected PersonalId personalId;

    public Personal(PersonalId personalId, DatosPersonales datosPersonales) {
        super(personalId);
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply();
        appendChange(new PersonalEditado(personalId, datosPersonales)).apply();
    }

    //Constructor privado para afectar los estados
    public Personal(PersonalId personalId) {
        super(personalId);
        //subscribe(new PersonalChange(this));pendiente por hacer
    }

    //Comportamientos
    public void agregarPersonal(PersonalId personalId, DatosPersonales datosPersonales) {
        Objects.requireNonNull(personalId);
        Objects.requireNonNull(datosPersonales);
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply();
    }

    public void editarPersonal(PersonalId personalId, DatosPersonales datosPersonales){
        appendChange(new PersonalEditado(personalId, datosPersonales)).apply();
    }

}
