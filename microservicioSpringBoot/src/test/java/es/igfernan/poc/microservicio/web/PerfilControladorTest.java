package es.igfernan.poc.microservicio.web;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mockito;

import es.igfernan.poc.microservicio.componentes.PerfilComponente;
import es.igfernan.poc.microservicio.dominio.Perfil;
import es.igfernan.poc.microservicio.validadores.PerfilValidador;

/**
 * Clase que contiene las pruebas unitarias de la clase @PerfilControlador
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
public class PerfilControladorTest {

    @Test
    public void testObtenerPerfilPorIdPerfil() {
	PerfilComponente perfilComponenteMock = Mockito.mock(PerfilComponente.class);
	PerfilValidador perfilValidadorMock = Mockito.mock(PerfilValidador.class);

	Mockito.when(perfilComponenteMock.obtenerPerfil(Mockito.anyLong())).thenReturn(new Perfil());

	PerfilControlador perfilControlador = new PerfilControlador(perfilComponenteMock, perfilValidadorMock);
	assertNotNull("Perfil DTO nulo", perfilControlador.obtenerPerfil(1L));
	Mockito.verify(perfilComponenteMock, Mockito.times(1)).obtenerPerfil(Mockito.anyLong());
    }

}
