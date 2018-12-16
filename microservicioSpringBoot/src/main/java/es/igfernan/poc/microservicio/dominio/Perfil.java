package es.igfernan.poc.microservicio.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa un objeto de dominio de un perfil con toda su informacion
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Perfil {

    /** Identificador interno de perfil */
    private Long idPerfil;

    /** Nombre del perfil */
    private String nombre;

    /** Primer apellido del perfil */
    private String primerApellido;

    /** Segundo apellido del perfil */
    private String segundoApellido;

}
