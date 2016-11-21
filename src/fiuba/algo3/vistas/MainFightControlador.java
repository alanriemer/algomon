package fiuba.algo3.vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class MainFightControlador implements Initializable {
	
	@FXML
	private Button nombreAlgo1;
	
	@FXML
	private Button nombreAlgo2;

	@FXML
	private Button fightAtaque;

	@FXML
	private Button fightItems;
	
	@FXML
	private Button fightCambio;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nombreAlgo1.setText("TEST");
	}
}
