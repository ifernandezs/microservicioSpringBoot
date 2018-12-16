package es.igfernan.poc.microservicio.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.igfernan.poc.microservicio.componentes.PerfilComponente;
import es.igfernan.poc.microservicio.dominio.dto.PerfilDTO;
import es.igfernan.poc.microservicio.mapper.PerfilMapper;
import es.igfernan.poc.microservicio.validadores.PerfilValidador;

/**
 * Controlador Rest para peticiones de perfil
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
@RestController
@RequestMapping(value = "/perfil")
public class PerfilControlador {

    /** Componente interno de negocio de perfil */
    private PerfilComponente perfilComponente;
    /** Validador de parametros de entrada del perfil */
    private PerfilValidador perfilValidador;

    /**
     * Constructor con parametros necesarios
     * 
     * @param perfilComponente
     *            componente de perfiles
     * @param perfilValidador
     *            validador de perfiles
     */
    @Autowired
    public PerfilControlador(PerfilComponente perfilComponente, PerfilValidador perfilValidador) {
	this.perfilComponente = perfilComponente;
	this.perfilValidador = perfilValidador;
    }

    /**
     * Metodo que obtiene un perfil a partir de su identificador de perfil
     * 
     * @param idPerfil
     *            identificador de perfil solicitado
     * @return Informacion de perfil solicitado
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{idPerfil}")
    public ResponseEntity<PerfilDTO> obtenerPerfil(@PathVariable("idPerfil") Long idPerfil) {
	perfilValidador.validarParametrosEntradaGetPerfil(idPerfil);
	return new ResponseEntity<PerfilDTO>(PerfilMapper.mapearEntidadEnDTO(perfilComponente.obtenerPerfil(idPerfil)),
		HttpStatus.OK);
    }

}
