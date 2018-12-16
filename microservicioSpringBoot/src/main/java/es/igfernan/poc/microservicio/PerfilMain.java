package es.igfernan.poc.microservicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase Main del microservicio de perfil
 * 
 * @author Ignacio Fernandez Sanchez
 *
 */
@SpringBootApplication
public class PerfilMain {

    /**
     * Metodo main para levantar el microservicio
     * 
     * @param args
     *            argumentos necesarios por el microservicio
     */
    public static void main(String[] args) {
	SpringApplication.run(PerfilMain.class, args);
    }

}
