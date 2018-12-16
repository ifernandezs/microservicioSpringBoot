package es.igfernan.poc.microservicio.validadores;

import org.junit.Test;

import es.igfernan.poc.microservicio.excepciones.PerfilBadRequestException;

/**
 * Clase que contiene las pruebas unitarias de la clase @PerfilValidador
 * 
 * @author Ignacio Fernández Sánchez
 *
 */
public class PerfilValidadorTest {

	/**
	 * Metodo que valida los datos de entrada OK
	 */
	@Test
	public void testValidarParametrosEntradaGetOk() {
		PerfilValidador perfilValidador = new PerfilValidador();
		perfilValidador.validarParametrosEntradaGetPerfil(new Long(1));
	}

	/**
	 * Metodo que valida los datos de entrada KO
	 */
	@Test(expected = PerfilBadRequestException.class)
	public void testValidarParametrosEntradaGetKO() {
		PerfilValidador perfilValidador = new PerfilValidador();
		perfilValidador.validarParametrosEntradaGetPerfil(null);
	}

}
