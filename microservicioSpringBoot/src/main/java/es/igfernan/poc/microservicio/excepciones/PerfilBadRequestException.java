package es.igfernan.poc.microservicio.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Excepcion producida en caso de que los datos de entrada de los servicio expuestos no sean correctos
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "Perfil: los datos de entrada indicados no son validos")
public class PerfilBadRequestException extends RuntimeException {

    /** Serializacion */
    private static final long serialVersionUID = 1L;

}
