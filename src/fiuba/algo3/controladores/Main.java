package fiuba.algo3.controladores;

import java.io.IOException;

import fiuba.algo3.modelo.JuegoAlgomon;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Squirtle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;	
	public static JuegoAlgomon nuevoJuego = new JuegoAlgomon();
	
	public static void restart(){
		Main.nuevoJuego = new JuegoAlgomon();
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();	
		nuevoJuego.getJugador1().agregarAlgomon(squirtle);
		nuevoJuego.getJugador2().agregarAlgomon(charmander);
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Algomon - La aventura recien comienza");
		showMainView();
		showMainItems();
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();	
		nuevoJuego.getJugador1().agregarAlgomon(squirtle);
		nuevoJuego.getJugador2().agregarAlgomon(charmander);
	}

	private void showMainView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../vistas/MenuPrincipalVista.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void showMainItems() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../vistas/VentanaInicioVista.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);
	}
	
	public static void showNuevo() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../vistas/VentanaInicioVista.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);
	}
	
	public static void showEscenarioPelea() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../vistas/PeleaVista.fxml"));
		BorderPane escenarioPelea = loader.load();
		mainLayout.setCenter(escenarioPelea);
	}
	
	public static void showAtaquesView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../vistas/AtaquesVista.fxml"));
		BorderPane escenarioPelea = loader.load();
		mainLayout.setCenter(escenarioPelea);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
