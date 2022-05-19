package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.Usuario;

public class ControllerLogin {

    @FXML
    private TextField TextFieldSenhaCadastro;

    @FXML
    private TextField TextFieldSenhaLogin;

    @FXML
    private TextField TextFieldUsuarioCadastro;

    @FXML
    private TextField TextFieldUsuarioLogin;

    @FXML
    void Cadastrar(ActionEvent event) {
        String login = this.TextFieldUsuarioCadastro.getText();
        String senha = this.TextFieldSenhaCadastro.getText();

        Usuario novoUsuario = new Usuario(login, senha);

        ArrayList<String> Usuarios = new ArrayList<String>();
        Usuarios.add(novoUsuario.getLogin());
        Usuarios.add(novoUsuario.getSenha());

        JOptionPane.showMessageDialog(null, Usuarios);
    }

    @FXML
    void Logar(ActionEvent event) {
        String usuario = this.TextFieldUsuarioLogin.getText();
        String senha = this.TextFieldSenhaLogin.getText();
    }
}
