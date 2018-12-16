package es.igfernan.poc.microservicio.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.igfernan.poc.microservicio.dominio.Perfil;
import es.igfernan.poc.microservicio.dominio.dto.PerfilDTO;

/**
 * Clase que contiene las pruebas unitarias de la clase @PerfilMapper
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
public class PerfilMapperTest {

	/**
	 * Test unitario para el mapeo de un perfil en DTO
	 */
	@Test
	public void testMapearPerfilEnDTO() {
		Perfil perfil = Perfil.builder().idPerfil(new Long(1)).nombre("Ignacio").primerApellido("Fernandez")
				.segundoApellido("Sanchez").build();
		PerfilDTO perfilDTO = PerfilMapper.mapearEntidadEnDTO(perfil);
		assertEquals("Identificador de perfil no esperado", perfil.getIdPerfil(), perfilDTO.getIdPerfil());
		assertEquals("Nombre de perfil no esperado", perfil.getNombre(), perfilDTO.getNombre());
		assertEquals("Primer apellido de perfil no esperado", perfil.getPrimerApellido(),
				perfilDTO.getPrimerApellido());
		assertEquals("Segundo apellido de perfil no esperado", perfil.getSegundoApellido(),
				perfilDTO.getSegundoApellido());
	}

}
