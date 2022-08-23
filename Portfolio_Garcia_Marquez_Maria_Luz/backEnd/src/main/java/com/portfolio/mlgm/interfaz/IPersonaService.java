package com.portfolio.mlgm.interfaz;

import com.portfolio.mlgm.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto, buscando por id
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
    
}
