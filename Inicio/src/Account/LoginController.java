/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Vicente
 */
import java.net.URL;
import java.io.*;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable, ControlledScreen {

    @FXML
    private TextField usuario;

    @FXML
    private PasswordField senha;

    @FXML
    private Button registrar;

    @FXML
    private Button entrar;
    
    @FXML
    private Label campoLogin;

    ScreensController myController;
    
    ArrayList<String> recuperada = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    public void irParaRegistro(ActionEvent event) { 
        myController.setScreen(Main.telaRegistro);
    }
    @FXML
    public void compararCampos(ActionEvent event){
        String dados = usuario.getText() + "/" + senha.getText();
        
        recuperarCampos();
        
        if(recuperada.contains(dados)){
            //irParaConta();
            campoLogin.setText("Entrando ....");
        } else{
            campoLogin.setText("Usuário e/ou Senha incorretos!");
        }
        
        
    }
    public void recuperarCampos(){
        try{
            FileReader fileReader = new FileReader("users.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while((line= reader.readLine())!=null){
                recuperada.add(line);
            }
        }catch(IOException ex) {
            System.out.println("Error ao carregar arquivo");
            ex.printStackTrace();
        }
    }
    public void irParaConta(){
        //muda de tela aqui
    }

}
