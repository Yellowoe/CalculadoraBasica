package joxan.lab2calculadora_joxanportilla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
//Joxan Portilla Hernandez 
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculadora.fxml"));
       Scene scene = new Scene(loader.load());
       scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle("Calculadora");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/ImagenesCalcu/icon.png")));
       ((CalculadoraController)loader.getController()).init(stage);
        stage.show();
    }



    public static void run() {
        launch();
    }

}