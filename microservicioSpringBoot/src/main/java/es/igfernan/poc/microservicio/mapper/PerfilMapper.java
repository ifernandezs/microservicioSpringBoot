package es.igfernan.poc.microservicio.mapper;

import es.igfernan.poc.microservicio.dominio.Perfil;
import es.igfernan.poc.microservicio.dominio.dto.PerfilDTO;

/**
 * Mapper que realiza el mapeo entre una entidad de dominio de perfil y su dto correspondiente
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
public class PerfilMapper {

    /**
     * Metodo que realiza el mapeo de una entidad de dominio perfil a un dto
     * 
     * @param perfil
     *            entidad de dominio de perfil
     * @return dto de perfil
     */
    public static PerfilDTO mapearEntidadEnDTO(Perfil perfil) {
	return PerfilDTO.builder().idPerfil(perfil.getIdPerfil()).nombre(perfil.getNombre())
		.primerApellido(perfil.getPrimerApellido()).segundoApellido(perfil.getSegundoApellido()).build();
    }

}
