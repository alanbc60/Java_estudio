package com.temario.aprendiendospringboot.ApiRestFul.Medico;

import com.temario.aprendiendospringboot.ApiRestFul.Direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion) {
}
