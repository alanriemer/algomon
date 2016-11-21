package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import fiuba.algo3.controladores.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainFightControlador implements Initializable {
	
	@FXML
	private Label vidaJ1;
	@FXML
	private Label vidaJ2;

	@FXML
	private Button nombreAlgo1;
	@FXML
	private Button nombreAlgo2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		vidaJ1.setText(String.valueOf(Main.nuevo.getJugador1().algomonActual().getPuntosVidaActuales()));
		vidaJ2.setText(String.valueOf(Main.nuevo.getJugador2().algomonActual().getPuntosVidaActuales()));
		nombreAlgo1.setText(Main.nuevo.getJugador1().algomonActual().getNombre());
		nombreAlgo2.setText(Main.nuevo.getJugador2().algomonActual().getNombre());
	}
	
	@FXML
	public void goAtaquesView() throws IOException{
		Main.showAtaquesView();
	}
}
