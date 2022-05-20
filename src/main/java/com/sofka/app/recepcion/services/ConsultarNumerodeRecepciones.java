package com.sofka.app.recepcion.services;

import com.sofka.app.recepcion.Recepcion;
import com.sofka.app.recepcion.values.RecepcionId;

public interface ConsultarNumerodeRecepciones {
    Recepcion ConsultarNumerodeRecepcionesId(RecepcionId recepcionId);
}
