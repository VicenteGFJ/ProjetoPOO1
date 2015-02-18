package Account;

/**
 *
 * @author Vicente
 */
import java.io.*;
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
    private PasswordField confirmarReg;

    @FXML
    private Label campoRegistro;

    @FXML
    private Button registrar;

    @FXML
    private Button voltar;
    
    private ArrayList<String> usuarios = new ArrayList<>();
    
    private ArrayList<String> registros = new ArrayList<>();
    
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
        limparCampos(1);
        myController.setScreen(Main.telaInicial);
    }
     
    @FXML
    public void compararSenhas(ActionEvent event){
        if(senhaReg.getText().equals(confirmarReg.getText())){
            salvarCampos();
        }else{
            campoRegistro.setText("As senhas não correspondem!");
            limparCampos(2);
        }
    }
    
   public void salvarCampos(){
            
            if(! (registros.isEmpty() ) ){ // Lista de registros não está vazia
                if(usuarios.contains(usuarioReg.getText())){
                    campoRegistro.setText("O usuario escolhido já existe!");
                    limparCampos(1);
                }else{
                    String info = usuarioReg.getText() + "/" + senhaReg.getText();
                    
                    usuarios.add(usuarioReg.getText());
                    registros.add(info);
                   
                    campoRegistro.setText("Dados salvos com sucesso!");
                    limparCampos(1);
                    
                }
                    
            }else{  // Lista de registros está vazia
                    
                    String info = usuarioReg.getText() + "/" + senhaReg.getText();
                    usuarios.add(usuarioReg.getText());
                    registros.add(info);
                    campoRegistro.setText("Dados salvos com sucesso!");
                    limparCampos(1);
            }
                        
    }
    public void salvarArquivo(){
        
        try {
                FileWriter file = new FileWriter ("users.txt");
                BufferedWriter writer = new BufferedWriter (file);
                for (String info : registros) {
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
    
    private void limparCampos (int op){ // Para poder usar o mesmo método , na hora de comparar as senhas e limpar normal
        if (op==1){
            usuarioReg.setText("");
            senhaReg.setText("");
            confirmarReg.setText("");
        }else if(op==2){
            senhaReg.setText("");
            confirmarReg.setText("");
        }
    }
}
