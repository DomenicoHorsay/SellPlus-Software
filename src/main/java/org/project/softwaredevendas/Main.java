package org.project.softwaredevendas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/project/softwaredevendas/HelloApplication.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Sistema de Vendas");
        stage.setScene(scene);
        stage.show();
        stage.getIcons().add(new Image(getClass().getResource("/org/project/softwaredevendas/icons/icon.png").toExternalForm()));

    }

    public static void main(String[] args) {
        launch();
    }
}
