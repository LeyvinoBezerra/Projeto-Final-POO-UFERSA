package model;

import javax.swing.JOptionPane;

public class LoginModel {
	public boolean autenticar(String login, String senha) {
		if(login.equals("escolar") && senha.equals("java")) {
			JOptionPane.showMessageDialog(null, "Logou");
		}
		else {
			JOptionPane.showMessageDialog(null, "Errou o Login ou Senha");
		}
		return false;
	}

}
