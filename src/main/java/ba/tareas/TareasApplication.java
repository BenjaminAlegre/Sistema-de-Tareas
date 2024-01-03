package ba.tareas;

import ba.tareas.prensentacion.SistemaTareasFx;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
		Application.launch(SistemaTareasFx.class, args);
//		SpringApplication.run(TareasApplication.class, args);
	}



}
