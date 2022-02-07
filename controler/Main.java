package controler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	public void start (Stage palco) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/view/loginJFX.fxml"));
			
			Scene scene = new Scene(root);
			
			palco.setTitle("Sistema Escolar");
			palco.setScene(scene);
			palco.show();
			
						
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch();
	}

}
