package es.igfernan.poc.microservicio.validadores;

import org.junit.Test;

import es.igfernan.poc.microservicio.excepciones.PerfilBadRequestException;

public class PerfilValidadorTest {

    @Test
    public void testValidarParametrosEntradaGetOk() {
	PerfilValidador perfilValidador = new PerfilValidador();
	perfilValidador.validarParametrosEntradaGetPerfil(new Long(1));
    }

    @Test(expected = PerfilBadRequestException.class)
    public void testValidarParametrosEntradaGetKO() {
	PerfilValidador perfilValidador = new PerfilValidador();
	perfilValidador.validarParametrosEntradaGetPerfil(null);
    }

}
