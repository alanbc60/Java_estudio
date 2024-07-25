package com.temario.aprendiendospringboot.ApiRestFul.Controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temario.aprendiendospringboot.ApiRestFul.Medico.DatosRegistroMedico;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/medicos")
public class MedicoController {
    // la anotación @RequestBody para recibir datos del cuerpo de la solicitud en un parámetro en el Controller;
    // Sin esta anotación, Spring no leerá el cuerpo de la solicitud ni va mapear sus campos al DTO recibido como parámetro.
    
    @PostMapping    
    public void registrarMedico(@RequestBody DatosRegistroMedico datosRegistroMedico) {
        System.out.println("=========Medico registrado========");
        System.out.println(datosRegistroMedico);
    }
}
