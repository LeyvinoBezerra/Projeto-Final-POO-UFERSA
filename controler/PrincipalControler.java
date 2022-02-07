package controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrincipalControler {
	@FXML private Principal telaDeLogin;
	@FXML private Label texto;
	
	@FXML protected void voltar (ActionEvent event) {
		telaDeLogin = new Principal();
		telaDeLogin.abrirNovaJanela();
		
	}
}
