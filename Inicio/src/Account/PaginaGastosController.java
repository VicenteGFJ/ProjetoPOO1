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
public class PaginaGastosController implements Initializable, ControlledScreen {
    
    @FXML
    private Button voltarMenu;
    
    ScreensController myController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
   
    @FXML
    private void irParaPagina1(ActionEvent event) {
        myController.setScreen(Main.telaPagina1);
    }
    
}
