package ba.tareas.prensentacion;

import ba.tareas.TareasApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class SistemaTareasFx extends Application {

    private ConfigurableApplicationContext applicationContext;

//    public static void main(String[] args) {
//
//        launch(args);
//    }

    @Override
    public void init() throws Exception {
        this.applicationContext = SpringApplication.run(SistemaTareasFx.class);

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean);

        Scene escena = new Scene(loader.load());
        primaryStage.setScene(escena);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
        Platform.exit();
    }
}
