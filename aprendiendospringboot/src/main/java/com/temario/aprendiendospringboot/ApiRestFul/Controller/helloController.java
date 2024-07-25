package com.temario.aprendiendospringboot.ApiRestFul.Controller;

/**
 * helloController
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

// Para que Spring reconozca la clase como un Controller, debe anotarse con @Controller o @RestController.
@RestController
// va a actuar como un endpoint cuando se entre a la ruta
@RequestMapping("/hello") 
// public String getMethodName() {
//     return new String();
// }

public class helloController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}