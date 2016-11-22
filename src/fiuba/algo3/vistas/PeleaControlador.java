package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import fiuba.algo3.controladores.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class PeleaControlador implements Initializable {
	
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
		vidaJ1.setText(String.valueOf(Main.nuevoJuego.getJugador1().algomonActual().getPuntosVidaActuales()));
		vidaJ2.setText(String.valueOf(Main.nuevoJuego.getJugador2().algomonActual().getPuntosVidaActuales()));
		nombreAlgo1.setText(Main.nuevoJuego.getJugador1().algomonActual().getNombre());
		nombreAlgo2.setText(Main.nuevoJuego.getJugador2().algomonActual().getNombre());
		if (Main.nuevoJuego.getJugador1().algomonActual().getPuntosVidaActuales() == 0){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(null);
			alert.setHeaderText(null);
			alert.setContentText("El Algomon del jugador 1 ha muerto, el jugador 2 gana!");
			alert.showAndWait();
			Main.restart();
		}
		if (Main.nuevoJuego.getJugador2().algomonActual().getPuntosVidaActuales() == 0){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(null);
			alert.setHeaderText(null);
			alert.setContentText("El Algomon del jugador 2 ha muerto, el jugador 1 gana!");
			alert.showAndWait();
			Main.restart();
		}
	}
	
	@FXML
	public void goAtaquesView() throws IOException{
		Main.showAtaquesView();
	}
}
