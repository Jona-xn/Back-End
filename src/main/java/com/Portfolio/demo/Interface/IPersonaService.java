
package com.Portfolio.demo.Interface;

import com.Portfolio.demo.Entity.Persona;
import java.util.List;





public interface IPersonaService {
    //Trae una lista de Personas
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    
    public void deletePersona(Long id);
    
    
    public Persona findPersona(Long id);    
}
