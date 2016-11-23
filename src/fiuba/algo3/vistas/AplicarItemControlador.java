package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import fiuba.algo3.controladores.Aplicacion;
import fiuba.algo3.modelo.elementos.Elemento;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
		List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		nombreItem1.setText(elementos.get(0));
		nombreItem2.setText(elementos.get(1));
		nombreItem3.setText(elementos.get(2));
		nombreItem4.setText(elementos.get(3));
		aplicar1.setText("Usar");
		aplicar2.setText("Usar");
		aplicar3.setText("Usar");
		aplicar4.setText("Usar");
	}

	public void usarItem1() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarPocion();
		Aplicacion.nuevoJuego.aplicarElemento(elemento);
		Aplicacion.showEscenarioPelea();
	}

	public void usarItem2() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarSuperPocion();
		Aplicacion.nuevoJuego.aplicarElemento(elemento);
		Aplicacion.showEscenarioPelea();
	}

	public void usarItem3() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarVitamina();
		Aplicacion.nuevoJuego.aplicarElemento(elemento);
		Aplicacion.showEscenarioPelea();
	}

	public void usarItem4() throws IOException{
		//List<String> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Elemento elemento = Aplicacion.nuevoJuego.getJugadorActual().sacarRestaurador();
		Aplicacion.nuevoJuego.aplicarElemento(elemento);
		Aplicacion.showEscenarioPelea();
	}
}

