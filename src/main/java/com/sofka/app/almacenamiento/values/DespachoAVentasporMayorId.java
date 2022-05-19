package com.sofka.app.almacenamiento.values;

import co.com.sofka.domain.generic.Identity;

public class DespachoAVentasporMayorId extends Identity {
    public DespachoAVentasporMayorId() {
    }

    public DespachoAVentasporMayorId(String id) {
        super(id);
    }

    public static  DespachoAVentasporMayorId of (String id) {
        return  new DespachoAVentasporMayorId(id);
    }
}

