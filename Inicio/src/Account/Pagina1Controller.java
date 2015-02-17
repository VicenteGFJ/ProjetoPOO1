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
    private Button saldo;
    
    @FXML
    private Button addConta;

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
    private void irParaGastos(ActionEvent event) {
        myController.setScreen(Main.telaPaginaGastos);
    }
    
    @FXML
    private void irParaConsultarSaldo(ActionEvent event) {
        myController.setScreen(Main.telaPaginaSaldo);
    }
    
    @FXML
    private void irParaAdicionarConta(ActionEvent event) {
        myController.setScreen(Main.telaPaginaAdicionarConta);
    }

}
