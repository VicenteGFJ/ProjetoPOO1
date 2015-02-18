/*
 Seriam aqui onde viriam as definições de categoria
 */
package Account;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Cecília Assis
 */
public class PaginaAdicionarContaController implements Initializable, ControlledScreen {

    ScreensController myController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
    
}
