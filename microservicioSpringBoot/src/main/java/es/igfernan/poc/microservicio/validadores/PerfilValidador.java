package es.igfernan.poc.microservicio.validadores;

import org.springframework.stereotype.Component;

import es.igfernan.poc.microservicio.excepciones.PerfilBadRequestException;

/**
 * Validador interno de parametros de entrada del microservicio de perfiles
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
@Component
public class PerfilValidador {

    /**
     * Metodo que valida los parametros de entrada al servicio
     * 
     * @param idPerfil
     *            identificador de perfil
     */
    public void validarParametrosEntradaGetPerfil(Long idPerfil) {
	validarNulo(idPerfil);
    }

    /**
     * Metodo que realiza la verificacion de que un parametro no sea nulo
     * 
     * @param parametro
     *            parametro a validar
     */
    private void validarNulo(Long parametro) {
	if (parametro == null) {
	    throw new PerfilBadRequestException();
	}
    }

}
