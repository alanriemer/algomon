package fiuba.algo3.vistas;

import java.io.IOException;
import fiuba.algo3.controladores.Aplicacion;
import javafx.fxml.FXML;

public class VentanaInicioControlador {

	@FXML
	public void goEscenarioPelea() throws IOException{
		Aplicacion.showEscenarioPelea();
	}
}
