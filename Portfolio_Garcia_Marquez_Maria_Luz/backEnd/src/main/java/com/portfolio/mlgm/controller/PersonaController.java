package com.portfolio.mlgm.controller;

import com.portfolio.mlgm.entity.Persona;
import com.portfolio.mlgm.interfaz.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
     ipersonaService.savePersona(persona);
     return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/(id)")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
             return "La persona fue eliminada correctamente";      
    }
    
    
}