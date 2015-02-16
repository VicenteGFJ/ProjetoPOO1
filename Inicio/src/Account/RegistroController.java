package Account;

/**
 *
 * @author Vicente
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroController implements Initializable, ControlledScreen {

    @FXML
    private TextField usuarioReg;

    @FXML
    private PasswordField senhaReg;

    @FXML
    private Label campoAviso;

    @FXML
    private Button registrar;

    @FXML
    private Button voltar;
    
    private int cont = 0;
    
    private ArrayList<String> lista = new ArrayList<String>();

    ScreensController myController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void voltarLogin(ActionEvent event) { 
        limparCampos();
        myController.setScreen(Main.telaInicial);
    }
    
    private void limparCampos (){ //private ou public?
        usuarioReg.setText("");
        senhaReg.setText("");
     //   emailReg.setText("");
    }
    
    public void salvarCampos(ActionEvent event){
            String dados = usuarioReg.getText() + "\n" + senhaReg.getText()+"$$"+"\n";
            lista.add(dados);
           
           int data =lista.size();
           for ( cont=0 ; cont< data ; cont ++){
               System.out.println(lista.get(cont));
           }
            
            campoAviso.setText("Dados salvos com sucesso!");
    //  cont++; 
    }
}
