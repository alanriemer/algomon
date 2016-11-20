package fiuba.algo3.vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class VistaPrincipal implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void doExit(){
		Platform.exit();
	}
	
	public void showAbout(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Acerca de nosotros");
		alert.setHeaderText(null);
		alert.setContentText(
				"Juego creado para la materia 75.07"
				+"\n Autores:"
				+"\n - Cotarelo, Rodrigo"
				+"\n - Denis, Leandro"
				+"\n - Riemer, Alan");

		alert.showAndWait();
	}
}
