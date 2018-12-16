package es.igfernan.poc.microservicio.componentes;

import org.springframework.stereotype.Component;

import es.igfernan.poc.microservicio.dominio.Perfil;

/**
 * Componente interno de negocio que contiene la logica de negocio del dominio de perfiles
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
@Component
public class PerfilComponente {

    /**
     * Metodo que obtiene un perfil en base a un identificador de perfil dado
     * 
     * @param idPerfil
     *            identificador de perfil
     * @return Perfil obtenido
     */
    public Perfil obtenerPerfil(Long idPerfil) {
	return Perfil.builder().idPerfil(new Long(1)).nombre("Ignacio").primerApellido("Fernandez")
		.segundoApellido("Sanchez").build();

    }

}
