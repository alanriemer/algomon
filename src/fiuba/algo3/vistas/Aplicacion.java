package fiuba.algo3.vistas;

import java.io.IOException;
import java.nio.file.Paths;
import fiuba.algo3.modelo.Juego;
import fiuba.algo3.modelo.JuegoAlgomon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Aplicacion extends Application {
	private static Stage primaryStage;
	private static BorderPane mainLayout;
	public static Juego nuevoJuego = new JuegoAlgomon();

	public static void restart() throws IOException{
		Aplicacion.nuevoJuego = new JuegoAlgomon();
		showMainView();
		nuevoJuego.setNombreJugador1("Ash");
		nuevoJuego.setNombreJugador2("Gary");
		showMainItems();
        Media media = new Media(Paths.get("/resources/a.mp3").toUri().toString());
        MediaPlayer mp = new MediaPlayer(media);
        mp.play();
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		Aplicacion.primaryStage = primaryStage;
		Aplicacion.primaryStage.setTitle("Algomon - La aventura recien comienza");
		showMainView();
		nuevoJuego.setNombreJugador1("Ash");
		nuevoJuego.setNombreJugador2("Gary");
		showMainItems();
        Media media = new Media(Paths.get("/resources/a.mp3").toUri().toString());
        MediaPlayer mp = new MediaPlayer(media);
        mp.play();

	}

	private static void showMainView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/MenuPrincipalVista.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void showMainItems() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/VentanaInicioVista.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);
	}

	public static void showNuevo() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/VentanaInicioVista.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);
	}

	public static void showEscenarioPelea() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/PeleaVista.fxml"));
		BorderPane escenarioPelea = loader.load();
		mainLayout.setCenter(escenarioPelea);
	}

	public static void showAtaquesView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/AtaquesVista.fxml"));
		BorderPane escenarioPelea = loader.load();
		mainLayout.setCenter(escenarioPelea);
	}

	public static void showCambioAlgomonView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/CambioAlgomonVista.fxml"));
		BorderPane escenarioPelea = loader.load();
		mainLayout.setCenter(escenarioPelea);
	}
	public static void showAplicarItemView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/AplicarItemVista.fxml"));
		BorderPane escenarioPelea = loader.load();
		mainLayout.setCenter(escenarioPelea);
	}

	public static void showEleccionAlgomones() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Aplicacion.class.getResource("/fiuba/algo3/vistas/EleccionAlgomonVista.fxml"));
		BorderPane escenarioPelea = loader.load();
		mainLayout.setCenter(escenarioPelea);
	}


	public static void main(String[] args) {
		launch(args);
	}



}
