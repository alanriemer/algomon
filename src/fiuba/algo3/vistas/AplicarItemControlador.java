package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.ElementoNoDisponibleException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class AplicarItemControlador implements Initializable {

	@FXML
	private Button aplicar1;
	@FXML
	private Button aplicar2;
	@FXML
	private Button aplicar3;
	@FXML
	private Button aplicar4;

	@FXML
	private Label nombreItem1;
	@FXML
	private Label nombreItem2;
	@FXML
	private Label nombreItem3;
	@FXML
	private Label nombreItem4;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		HashMap<String, Integer> cantElementos = Aplicacion.nuevoJuego.cantElementos();
		nombreItem1.setText("Pocion Cant: "+ cantElementos.get("Pocion"));
		nombreItem2.setText("SuperPocion Cant: " + cantElementos.get("SuperPocion"));
		nombreItem3.setText("Vitamina Cant: " + cantElementos.get("Vitamina"));
		nombreItem4.setText("Restaurador Cant:"+cantElementos.get("Restaurador"));
		aplicar1.setText("Usar");
		aplicar2.setText("Usar");
		aplicar3.setText("Usar");
		aplicar4.setText("Usar");
	}

	public void usarItem1() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento;
		try {
			elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarPocion();
			Aplicacion.nuevoJuego.aplicarElemento(elemento);
			Aplicacion.showEscenarioPelea();
		} catch (ElementoNoDisponibleException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no pudo recibir el elemento!");
			alert.setHeaderText(null);
			alert.setContentText("Ya no quedan mas elementos de este tipo");
			alert.showAndWait();
		}
	}

	public void usarItem2() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento;
		try {
			elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarSuperPocion();
			Aplicacion.nuevoJuego.aplicarElemento(elemento);
			Aplicacion.showEscenarioPelea();
		} catch (ElementoNoDisponibleException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no pudo recibir el elemento!");
			alert.setHeaderText(null);
			alert.setContentText("Ya no quedan mas elementos de este tipo");
			alert.showAndWait();
		}	
	}

	public void usarItem3() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento;
		try {
			elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarVitamina();
			Aplicacion.nuevoJuego.aplicarElemento(elemento);
			Aplicacion.showEscenarioPelea();
		} catch (ElementoNoDisponibleException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no pudo recibir el elemento!");
			alert.setHeaderText(null);
			alert.setContentText("Ya no quedan mas elementos de este tipo");
			alert.showAndWait();
		}
	}

	public void usarItem4() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento;
		try {
			elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarRestaurador();
			Aplicacion.nuevoJuego.aplicarElemento(elemento);
			Aplicacion.showEscenarioPelea();
		} catch (ElementoNoDisponibleException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no pudo recibir el elemento!");
			alert.setHeaderText(null);
			alert.setContentText("Ya no quedan mas elementos de este tipo");
			alert.showAndWait();
		}	
	}
	
	public void volver() throws IOException{
		Aplicacion.showEscenarioPelea();
	}
}

