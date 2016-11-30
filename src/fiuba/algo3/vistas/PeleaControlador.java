	package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;

public class PeleaControlador implements Initializable {

	@FXML
	private ImageView img1;
	@FXML
	private ImageView img2;

	@FXML
	private Label vidaJ1;
	@FXML
	private Label vidaJ2;

	@FXML
	private Button nombreAlgo1;
	@FXML
	private Button nombreAlgo2;

	@FXML
	private Label _nombre1;
	@FXML
	private Label _nombre2;
	@FXML
	private Label actual;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		actual.setText(Aplicacion.nuevoJuego.getNombreJugadorActual());
		_nombre1.setText(Aplicacion.nuevoJuego.getJugador1().algomonActual().getNombre());
		_nombre2.setText(Aplicacion.nuevoJuego.getJugador2().algomonActual().getNombre());
        Image image = new Image(Aplicacion.nuevoJuego.getJugador1().algomonActual().getImagen().toURI().toString());
        img1.setImage(image);
        Image image2 = new Image(Aplicacion.nuevoJuego.getJugador2().algomonActual().getImagen().toURI().toString());
        img2.setImage(image2);
		vidaJ1.setText(String.valueOf(Aplicacion.nuevoJuego.getPuntosVidaActualJugador1())+"/"+String.valueOf(Aplicacion.nuevoJuego.getPuntosVidaOriginalJugador1()));
		vidaJ2.setText(String.valueOf(Aplicacion.nuevoJuego.getPuntosVidaActualJugador2())+"/"+String.valueOf(Aplicacion.nuevoJuego.getPuntosVidaOriginalJugador2()));
		nombreAlgo1.setText(Aplicacion.nuevoJuego.getNombreJugador1());
		nombreAlgo2.setText(Aplicacion.nuevoJuego.getNombreJugador2());
		this.algomonMuerto();
		if (Aplicacion.nuevoJuego.getJugador1().algomonesMuertos()){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(null);
			alert.setHeaderText(null);
			alert.setContentText("El Algomon de Ash ha muerto, Gary gana!");
			alert.showAndWait();
			try {
				Aplicacion.restart();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Aplicacion.nuevoJuego.getJugador2().algomonesMuertos()){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(null);
			alert.setHeaderText(null);
			alert.setContentText("El Algomon de Gary ha muerto, Ash gana!");
			alert.showAndWait();
			try {
				Aplicacion.restart();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void algomonMuerto(){
		if (Aplicacion.nuevoJuego.getJugadorActual().algomonActual().estaMuerto()){
			String algomonMuerto = Aplicacion.nuevoJuego.getJugadorActual().algomonActual().getNombre();
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(null);
			alert.setHeaderText(null);
			alert.setContentText(algomonMuerto + " ha muerto, debe cambiarlo para Continuar!");
			alert.showAndWait();
		}
	}
	@FXML
	private void goAtaquesView() throws IOException{
		if (!Aplicacion.nuevoJuego.getJugadorActual().algomonActual().estaMuerto()){
			Aplicacion.showAtaquesView();
		}
		else {
			this.algomonMuerto();
		}
	}
	@FXML
	private void goCambioAlgomonView() throws IOException{
		Aplicacion.showCambioAlgomonView();
	}
	@FXML
	private void goAplicarItemView() throws IOException{
		if (!Aplicacion.nuevoJuego.getJugadorActual().algomonActual().estaMuerto()){
			Aplicacion.showAplicarItemView();
		}
		else {
			this.algomonMuerto();
		}
	}
}
