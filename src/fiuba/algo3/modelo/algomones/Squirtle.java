package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;

public class Squirtle extends Algomon{
	public Squirtle (){
		nombre = "Squirtle";
		imagen = new File("src/resources/Squirtle_XY.gif");
		puntosVida = 150;
		puntosVidaActuales = 150;
		Ataque burbuja = new AtaqueAgua(10,15, "Burbuja");
		Ataque canionDeAgua = new AtaqueAgua(20,8, "Canion de Agua");
		ataques.put("Burbuja",burbuja);
		ataques.put("Canion de Agua",canionDeAgua);
	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarAgua();
	}
}
