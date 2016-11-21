package fiuba.algo3.vistas;

import java.io.IOException;

import fiuba.algo3.controladores.Main;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainMenuControlador {
	
	Main main;
	
	@SuppressWarnings("static-access")
	public void doNuevo() throws IOException{
		main.showNuevo();
	}
	
	public void doExit(){
		System.exit(1);
	}
	
	public void doAbout(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Acerca de nosotros");
		alert.setHeaderText(null);
		alert.setContentText("Este juego fue creado para la materia 75.07"
				+ "\nAutores:"
				+ "\n-Cotarelo, Rodrigo"
				+ "\n-Denis, Leandro"
				+ "\n-Riemer, Alan");
		alert.showAndWait();
	}
}
