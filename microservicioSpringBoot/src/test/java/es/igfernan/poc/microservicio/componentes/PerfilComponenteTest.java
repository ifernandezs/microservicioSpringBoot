package es.igfernan.poc.microservicio.componentes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.igfernan.poc.microservicio.dominio.Perfil;

/**
 * Clase que contiene las pruebas unitarias de la clase @PerfilComponente
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
public class PerfilComponenteTest {

    @Test
    public void testObtenerPerfil() {
	PerfilComponente componente = new PerfilComponente();
	Perfil perfil = componente.obtenerPerfil(new Long(1));

	assertEquals("Identificador de perfil no esperado", new Long(1), perfil.getIdPerfil());
	assertEquals("Nombre de perfil no esperado", "Ignacio", perfil.getNombre());
	assertEquals("Primer apellido de perfil no esperado", "Fernandez", perfil.getPrimerApellido());
	assertEquals("Segundo apellido de perfil no esperado", "Sanchez", perfil.getSegundoApellido());
    }

}