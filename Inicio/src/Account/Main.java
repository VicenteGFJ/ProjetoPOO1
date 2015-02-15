/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Vicente
 */
public class Main extends Application {

    public static String telaInicial = "inicial";
    public static String telaInicialFile = "Login.fxml";
    public static String telaRegistro = "registro";
    public static String telaRegistroFile = "Registro.fxml";

    @Override
    public void start(Stage stage) /*throws Exception*/ {
        ScreensController telas = new ScreensController();
        telas.loadScreen(Main.telaInicial, Main.telaInicialFile);
        telas.loadScreen(Main.telaRegistro, Main.telaRegistroFile);

        telas.setScreen(Main.telaInicial);
        
        Group root = new Group();
        root.getChildren().addAll(telas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
