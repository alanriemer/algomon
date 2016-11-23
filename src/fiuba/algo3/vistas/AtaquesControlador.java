package fiuba.algo3.vistas;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import fiuba.algo3.controladores.Aplicacion;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
		List<String> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
		nombreAta1.setText(ataques.get(0));
		nombreAta2.setText(ataques.get(1));
		nombreAta3.setText(ataques.get(2));
		atacar1.setText("Usar");
		atacar2.setText("Usar");
		atacar3.setText("Usar");
	}
	
	public void usarAtaque1() throws IOException{
		List<String> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
		Aplicacion.nuevoJuego.atacarCon(ataques.get(0));
		Aplicacion.showEscenarioPelea();
	}
	
	public void usarAtaque2() throws IOException{
		List<String> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
		Aplicacion.nuevoJuego.atacarCon(ataques.get(1));
		Aplicacion.showEscenarioPelea();
	}
	
	public void usarAtaque3() throws IOException{
		List<String> ataques = Aplicacion.nuevoJuego.ataquesDisponiblesAlgomonActual();
		Aplicacion.nuevoJuego.atacarCon(ataques.get(2));
		Aplicacion.showEscenarioPelea();
	}
	
	public void volver() throws IOException{
		Aplicacion.showEscenarioPelea();
	}
}
