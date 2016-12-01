package fiuba.algo3.vistas;

import java.io.IOException;
//import java.io.IOException; 
import java.net.URL; 
import java.util.ResourceBundle;

//import fiuba.algo3.controladores.Aplicacion;
import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Chansey;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Jigglypuff;
import fiuba.algo3.modelo.algomones.Rattata;
import fiuba.algo3.modelo.algomones.Squirtle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
//import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.scene.control.Alert.AlertType;

public class EleccionAlgomonControlador implements Initializable{

	@FXML
	private Button bulbasaur;
	@FXML
	private Button squirtle;
	@FXML
	private Button charmander;
	@FXML
	private Button rattata;
	@FXML
	private Button jigglypuff;
	@FXML
	private Button chansey;
	
	@FXML
	private Label jugadorActual;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//INICIALIZO CADA IMAGEN
		//BULBASAUR
		Bulbasaur bulba = new Bulbasaur();
		Image imageBulbasaur = new Image(bulba.getImagen());
		ImageView bulbasaurView = new ImageView();
		bulbasaurView.setImage(imageBulbasaur);
		this.bulbasaur.setGraphic(bulbasaurView);
		this.bulbasaur.setContentDisplay(ContentDisplay.TOP);
		
		//SQUIRTLEl
		Squirtle squir = new Squirtle();
		Image imageSquirtle = new Image(squir.getImagen());
		ImageView squirtleView = new ImageView();
		squirtleView.setImage(imageSquirtle);
		this.squirtle.setGraphic(squirtleView);
		this.squirtle.setContentDisplay(ContentDisplay.TOP);
		
		//CHARMANDER
		Charmander charman = new Charmander();
		Image imageCharmander = new Image(charman.getImagen());
		ImageView charmanderView = new ImageView();
		charmanderView.setImage(imageCharmander);
		this.charmander.setGraphic(charmanderView);
		this.charmander.setContentDisplay(ContentDisplay.TOP);
		
		//RATTATA
		Rattata rata = new Rattata();
		Image imageRattata = new Image(rata.getImagen());
		ImageView rattataView = new ImageView();
		rattataView.setImage(imageRattata);
		this.rattata.setGraphic(rattataView);
		this.rattata.setContentDisplay(ContentDisplay.TOP);
		
		//JIGGLYPUFF
		Jigglypuff jiggly = new Jigglypuff();
		Image imageJigglypuff = new Image(jiggly.getImagen());
		ImageView jigglypuffView = new ImageView();
		jigglypuffView.setImage(imageJigglypuff);
		this.jigglypuff.setGraphic(jigglypuffView);
		this.jigglypuff.setContentDisplay(ContentDisplay.TOP);
		
		//CHANSEY
		Chansey chan = new Chansey();
		Image imageChansey = new Image(chan.getImagen());
		ImageView chanseyView = new ImageView();
		chanseyView.setImage(imageChansey);
		this.chansey.setGraphic(chanseyView);
		this.chansey.setContentDisplay(ContentDisplay.TOP);
		
		
		
		this.bulbasaur.setText("Bulbasaur");
		this.squirtle.setText("Squirtle");
		this.charmander.setText("Charmander");
		this.rattata.setText("Rattata");
		this.jigglypuff.setText("Jigglypuff");
		this.chansey.setText("Chansey");
		
		this.jugadorActual.setText(Aplicacion.nuevoJuego.getNombreJugadorActual());
	
	}
	
	@FXML
	public void agregarBulbasaurJugadorActual() throws IOException{
		Aplicacion.nuevoJuego.getJugadorActual().agregarAlgomon(new Bulbasaur());
		//AVISA QUE ELEGISTE
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(null);
		alert.setHeaderText(null);
		alert.setContentText("Has elegido a Bulbasaur");
		alert.showAndWait();
		//
		this.verificarQueEliganTodosSusAlgomones();
	}
	
	@FXML
	public void agregarSquirtleJugadorActual() throws IOException{
		Aplicacion.nuevoJuego.getJugadorActual().agregarAlgomon(new Squirtle());
		//AVISA QUE ELEGISTE
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(null);
		alert.setHeaderText(null);
		alert.setContentText("Has elegido a Squirtle");
		alert.showAndWait();
		//
		this.verificarQueEliganTodosSusAlgomones();
	}

	@FXML
	public void agregarCharmanderJugadorActual() throws IOException{
		Aplicacion.nuevoJuego.getJugadorActual().agregarAlgomon(new Charmander());
		//AVISA QUE ELEGISTE
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(null);
		alert.setHeaderText(null);
		alert.setContentText("Has elegido a Charmander");
		alert.showAndWait();
		//
		this.verificarQueEliganTodosSusAlgomones();
	}
	
	@FXML
	public void agregarRattataJugadorActual() throws IOException{
		Aplicacion.nuevoJuego.getJugadorActual().agregarAlgomon(new Rattata());
		//AVISA QUE ELEGISTE
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(null);
		alert.setHeaderText(null);
		alert.setContentText("Has elegido a Rattata");
		alert.showAndWait();
		//
		this.verificarQueEliganTodosSusAlgomones();
	}
	
	@FXML
	public void agregarJigglypuffJugadorActual() throws IOException{
		Aplicacion.nuevoJuego.getJugadorActual().agregarAlgomon(new Jigglypuff());
		//AVISA QUE ELEGISTE
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(null);
		alert.setHeaderText(null);
		alert.setContentText("Has elegido a Jigglypuff");
		alert.showAndWait();
		//
		this.verificarQueEliganTodosSusAlgomones();
	}
	
	@FXML
	public void agregarChanseyJugadorActual() throws IOException{
		Aplicacion.nuevoJuego.getJugadorActual().agregarAlgomon(new Chansey());
		//AVISA QUE ELEGISTE
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(null);
		alert.setHeaderText(null);
		alert.setContentText("Has elegido a Chansey");
		alert.showAndWait();
		//
		this.verificarQueEliganTodosSusAlgomones();
	}
	
	
	public void verificarQueEliganTodosSusAlgomones() throws IOException{
		if(Aplicacion.nuevoJuego.getJugadorActual().eligioTodosLosAlgomon()){
			if(Aplicacion.nuevoJuego.faltaQueEligaAlgunaJugador()){
				Aplicacion.nuevoJuego.jugadorActualYaEligio();
				Aplicacion.showEleccionAlgomones();
			}
			else{
				Aplicacion.showEscenarioPelea();
			}
		}
		
	}
	
	
}
