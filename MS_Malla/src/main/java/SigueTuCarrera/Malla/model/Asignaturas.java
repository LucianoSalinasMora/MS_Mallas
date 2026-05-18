package SigueTuCarrera.Malla.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Asignaturas {

    @Id
    private String codigoAsignatura;
    private String nombre;
    private Integer creditos;
    private Integer semestreSugerido;
    
    @ElementCollection(fetch = FetchType.EAGER) 
    private List<String> prerrequisitos;
}
