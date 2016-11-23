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
		List<Elemento> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		nombreItem1.setText(elementos.get(0).getNombre());
		nombreItem2.setText(elementos.get(1).getNombre());
		nombreItem3.setText(elementos.get(2).getNombre());
		nombreItem4.setText(elementos.get(3).getNombre());
		aplicar1.setText("Usar");
		aplicar2.setText("Usar");
		aplicar3.setText("Usar");
		aplicar4.setText("Usar");
	}

	public void usarItem1() throws IOException{
		List<Elemento> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Aplicacion.nuevoJuego.aplicarElemento(elementos.get(0));
		Aplicacion.showEscenarioPelea();
	}

	public void usarItem2() throws IOException{
		List<Elemento> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Aplicacion.nuevoJuego.aplicarElemento(elementos.get(1));
		Aplicacion.showEscenarioPelea();
	}

	public void usarItem3() throws IOException{
		List<Elemento> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Aplicacion.nuevoJuego.aplicarElemento(elementos.get(2));
		Aplicacion.showEscenarioPelea();
	}
	
	public void usarItem4() throws IOException{
		List<Elemento> elementos = Aplicacion.nuevoJuego.elementosDisponibles();
		Aplicacion.nuevoJuego.aplicarElemento(elementos.get(3));
		Aplicacion.showEscenarioPelea();
	}
}

