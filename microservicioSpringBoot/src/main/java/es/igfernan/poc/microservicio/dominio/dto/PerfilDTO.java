package es.igfernan.poc.microservicio.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto que representa la informacion del perfil.
 * 
 * Utilizamos la libreria Loombok para la implementacion de los metodos GET/SET
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PerfilDTO {

    /** Identificador de perfil */
    private Long idPerfil;

    /** Nombre */
    private String nombre;

    /** Primer apellido */
    private String primerApellido;

    /** Segundo apellido */
    private String segundoApellido;

}
