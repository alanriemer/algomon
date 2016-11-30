package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.excepciones.AlgomonInvalidoException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class CambioAlgomonControlador implements Initializable {


	@FXML
	private Button cambiar1;
	@FXML
	private Button cambiar2;
	@FXML
	private Button cambiar3;

	@FXML
	private Label nombreAlgomon1;
	@FXML
	private Label nombreAlgomon2;
	@FXML
	private Label nombreAlgomon3;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Algomon> algomones = Aplicacion.nuevoJuego.algomonesDisponibles();

		nombreAlgomon1.setText(algomones.get(0).getNombre());
		nombreAlgomon2.setText(algomones.get(1).getNombre());
		nombreAlgomon3.setText(algomones.get(2).getNombre());
		cambiar1.setText("Cambiar");
		cambiar2.setText("Cambiar");
		cambiar3.setText("Cambiar");
	}

	public void cambiarAlgomon1() throws IOException{
		List<Algomon> algomones = Aplicacion.nuevoJuego.algomonesDisponibles();
		try {
			Aplicacion.nuevoJuego.cambiarAlgomonJugadorActual(algomones.get(0));
			Aplicacion.showEscenarioPelea();
		} catch (AlgomonInvalidoException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no puede pelear!");
			alert.setHeaderText(null);
			alert.setContentText("El Algomon esta debilitado y no puede luchar");
			alert.showAndWait();
		}
	}

	public void cambiarAlgomon2() throws IOException{
		List<Algomon> algomones = Aplicacion.nuevoJuego.algomonesDisponibles();
		try {
			Aplicacion.nuevoJuego.cambiarAlgomonJugadorActual(algomones.get(1));
			Aplicacion.showEscenarioPelea();
		} catch (AlgomonInvalidoException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no puede pelear!");
			alert.setHeaderText(null);
			alert.setContentText("El Algomon esta debilitado y no puede luchar");
			alert.showAndWait();
		}
	}

	public void cambiarAlgomon3() throws IOException{
		List<Algomon> ataques = Aplicacion.nuevoJuego.algomonesDisponibles();
		try {
			Aplicacion.nuevoJuego.cambiarAlgomonJugadorActual(ataques.get(2));
			Aplicacion.showEscenarioPelea();
		} catch (AlgomonInvalidoException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no puede pelear!");
			alert.setHeaderText(null);
			alert.setContentText("El Algomon esta debilitado y no puede luchar");
			alert.showAndWait();
		}
	}
	
	public void volver() throws IOException{
		Aplicacion.showEscenarioPelea();
	}
}

