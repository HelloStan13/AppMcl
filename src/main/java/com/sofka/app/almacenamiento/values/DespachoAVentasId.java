package com.sofka.app.almacenamiento.values;

import co.com.sofka.domain.generic.Identity;

public class DespachoAVentasId  extends Identity {
    public DespachoAVentasId() {
    }

    public DespachoAVentasId(String id) {
        super(id);
    }

    public static  DespachoAVentasId of (String id) {
        return  new DespachoAVentasId(id);
    }
}
