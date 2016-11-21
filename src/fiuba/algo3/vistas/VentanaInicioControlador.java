package fiuba.algo3.vistas;

import java.io.IOException;
import fiuba.algo3.controladores.Main;
import javafx.fxml.FXML;

public class VentanaInicioControlador {
	Main main;
	
	@FXML
	public void goEscenarioPelea() throws IOException{
		Main.showEscenarioPelea();
	}
}
