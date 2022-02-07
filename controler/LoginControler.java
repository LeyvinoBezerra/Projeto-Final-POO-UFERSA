package controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.LoginModel;

public class LoginControler {
	@FXML private Label confirm;
	@FXML private TextField login;
	@FXML private TextField senha;
	@FXML private LoginModel model;
	@FXML Principal telaDeLogin;
	
	@FXML protected void autenticar(ActionEvent event) {
		model = new LoginModel();
		//model.autenticar(login.getText(), senha.getText());
		boolean deuCerto = model.autenticar(login.getText(), senha.getText());
	if(deuCerto) {
		telaDeLogin = new Principal();
		telaDeLogin.abrirNovaJanela();
		//Principal.abrirNovaJanela();
	}
	}
}
