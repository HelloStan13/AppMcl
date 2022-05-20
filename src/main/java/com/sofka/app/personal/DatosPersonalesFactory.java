package com.sofka.app.personal;

import com.sofka.app.personal.values.DatosPersonales;
import java.util.HashSet;
import java.util.Set;

public class DatosPersonalesFactory {
    private final Set<DatosPersonales> datosPersonales;

    private DatosPersonalesFactory(){
        this.datosPersonales = new HashSet<>();
    }
    public DatosPersonalesFactory agregarDatospersonales(DatosPersonales datosPersonales){
        datosPersonales.add(datosPersonales);
        return this;
    }

    public DatosPersonalesFactory(Set<DatosPersonales> datosPersonales) {
        this.datosPersonales = datosPersonales;
    }
    public static DatosPersonalesFactory builder(){
        return new DatosPersonalesFactory();
    }
    public Set<DatosPersonales> directrices() {
        return datosPersonales;
    }

}
