package Account;

/**
 *
 * @author Vicente
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
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
        salvarArquivo();
        limparCampos();
        myController.setScreen(Main.telaInicial);
    }
    
    private void limparCampos (){ //private ou public?
        usuarioReg.setText("");
        senhaReg.setText("");
     //   emailReg.setText("");
    }
    
    public void salvarCampos(ActionEvent event){
            String data = usuarioReg.getText() + "/" + senhaReg.getText();
            lista.add(data);
            campoAviso.setText("Dados salvos com sucesso!");
            limparCampos();
    }
    public void salvarArquivo(){
        
        try {
                FileWriter file = new FileWriter ("users.txt");
                BufferedWriter writer = new BufferedWriter (file);
                for (String info : lista) {
                    writer.write(info);
                    writer.newLine();
                }
                writer.close();
                file.close();
                /*for (int i=0;i<lista.size(); i++){
                    writer.write(lista.get(i).toString());
                    writer.newLine();
                }
                writer.close();
                file.close();*/
                      
                    

        }catch(IOException ex){
            System.out.println(" error no arquivo");
            ex.printStackTrace();
        }
        
        
        
    }
}
