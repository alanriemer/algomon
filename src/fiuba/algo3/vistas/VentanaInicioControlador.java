package fiuba.algo3.vistas;

import java.io.IOException;

import fiuba.algo3.controladores.Main;
import javafx.fxml.FXML;

public class VentanaInicioControlador {
	private Main main;
	
	@SuppressWarnings("static-access")
	@FXML
	public void goEscenarioPelea() throws IOException{
		main.showEscenarioPelea();
	}
}
