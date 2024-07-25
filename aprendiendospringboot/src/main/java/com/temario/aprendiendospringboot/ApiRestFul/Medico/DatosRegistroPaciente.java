package com.temario.aprendiendospringboot.ApiRestFul.Medico;

import com.temario.aprendiendospringboot.ApiRestFul.Direccion.DatosDireccion;

public record DatosRegistroPaciente(
        String nombre,
        String email,
        String telefono,
        String documentoIdentidad,
        DatosDireccion direccion
) {
}