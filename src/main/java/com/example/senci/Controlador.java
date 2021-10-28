/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.senci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author soporte
 */

@RestController
public class Controlador {
    @GetMapping("/")
    public String saluda(@RequestParam(value="name", defaultValue="usuario") String nombre){
        return String.format("Buenos dias, %s", nombre);
    }
    
}
