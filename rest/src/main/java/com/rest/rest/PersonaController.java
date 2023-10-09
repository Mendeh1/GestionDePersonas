package com.rest.rest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/V1")
public class PersonaController {
   private PersonaService personaService;

    @GetMapping("/personas/")
    public List<Persona> obtenerPersonas(){
        return this.personaService.obtenerPersonas();
    }
    @GetMapping ("/personas/{cedula}")
    public Persona obtenerPersonaPorCedula(@PathVariable("cedula")String cedula){
        return this.personaService.obtenerPersonaPorCeluda(cedula);
    }
    @DeleteMapping("/personas/{cedula}")
    public void deletePerson(@PathVariable("cedula")String cedula){
        this.personaService.eliminarPersona(cedula);
    }
    @PostMapping("/persona")
    public Persona agregarPersona(@RequestBody Persona persona){
        return this.personaService.crearPersona(persona);
    }
    @GetMapping("/persona")
    public List<Persona> agregarPersonaPorCiudad(@RequestParam String ciudad){
        return this.personaService.obtenerPersonaCiudad(ciudad);
    }


}
