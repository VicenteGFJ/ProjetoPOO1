package Account;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Vicente
 */
public class Pagina1Controller implements Initializable, ControlledScreen {

    @FXML
    private Button gastos;

    @FXML
    private Button deslogar;
    
    @FXML
    private Button addGasto;

    ScreensController myController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void voltarLogin(ActionEvent event) {
        myController.setScreen(Main.telaInicial);
    }
    
    @FXML
    private void irParaExtrato(ActionEvent event) {
        myController.setScreen(Main.telaPaginaExtrato);
    }
    
    @FXML
    private void irParaAdicionarGasto(ActionEvent event) {
        myController.setScreen(Main.telaPaginaAdicionarGasto);
    }

}
