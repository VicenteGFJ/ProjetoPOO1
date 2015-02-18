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
    public static String telaPagina1 = "Pagina1";
    public static String telaPagina1File = "Pagina1.fxml";
    public static String telaPaginaExtrato = "PaginaExtrato";
    public static String telaPaginaExtratoFile = "PaginaExtrato.fxml";
    public static String telaPaginaAdicionarGasto = "PaginaAdicionarGasto"; 
    public static String telaPaginaAdicionarGastoFile = "PaginaAdicionarGasto.fxml";
    

    @Override
    public void start(Stage stage) /*throws Exception*/ {
        ScreensController telas = new ScreensController();
        telas.loadScreen(Main.telaInicial, Main.telaInicialFile);
        telas.loadScreen(Main.telaRegistro, Main.telaRegistroFile);
        telas.loadScreen(Main.telaPagina1, Main.telaPagina1File);
        telas.loadScreen(Main.telaPaginaExtrato, Main.telaPaginaExtratoFile);
        telas.loadScreen(Main.telaPaginaAdicionarGasto, Main.telaPaginaAdicionarGastoFile);

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
