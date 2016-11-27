package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class AtaquesControlador implements Initializable {


	@FXML
	private Button atacar1;
	@FXML
	private Button atacar2;
	@FXML
	private Button atacar3;

	@FXML
	private Label nombreAta1;
	@FXML
	private Label nombreAta2;
	@FXML
	private Label nombreAta3;


	@FXML
	private Button volver;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Ataque> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
		nombreAta1.setText(ataques.get(0).getNombre() + " Cant: " +  ataques.get(0).cantidadDisponible());
		nombreAta2.setText(ataques.get(1).getNombre() + " Cant: " +  ataques.get(1).cantidadDisponible());
		nombreAta3.setText(ataques.get(2).getNombre() + " Cant: " +  ataques.get(2).cantidadDisponible());
		atacar1.setText("Usar");
		atacar2.setText("Usar");
		atacar3.setText("Usar");
	}

	public void usarAtaque1() throws IOException{
		try{
			List<Ataque> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
			Aplicacion.nuevoJuego.atacarCon(ataques.get(0).getNombre());
			Aplicacion.showEscenarioPelea();
		}
		catch(AtaqueNoDisponibleException e){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no pudo atacar!");
			alert.setHeaderText(null);
			alert.setContentText("Ya no quedan movimientos de este ataque");
			alert.showAndWait();
		}
	}

	public void usarAtaque2() throws IOException{
		try{
			List<Ataque> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
			Aplicacion.nuevoJuego.atacarCon(ataques.get(1).getNombre());
			Aplicacion.showEscenarioPelea();
		}
		catch(AtaqueNoDisponibleException e){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no pudo atacar!");
			alert.setHeaderText(null);
			alert.setContentText("Ya no quedan movimientos de este ataque");
			alert.showAndWait();
		}
	}

	public void usarAtaque3() throws IOException{
		try{
			List<Ataque> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
			Aplicacion.nuevoJuego.atacarCon(ataques.get(2).getNombre());
			Aplicacion.showEscenarioPelea();
		}
		catch(AtaqueNoDisponibleException e){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("El Algomon no pudo atacar!");
			alert.setHeaderText(null);
			alert.setContentText("Ya no quedan movimientos de este ataque");
			alert.showAndWait();
		}
	}

	public void volver() throws IOException{
		Aplicacion.showEscenarioPelea();
	}
}
