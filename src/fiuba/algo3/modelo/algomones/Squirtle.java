package fiuba.algo3.modelo.algomones;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.TipoAtaque;

public class Squirtle extends Algomon{
	public Squirtle (){
		nombre = "Squirtle";
		imagen = "/resources/Squirtle_XY.gif";
		puntosVida = 150;
		puntosVidaActuales = 150;
		Ataque burbuja = new AtaqueAgua(10,15, TipoAtaque.Burbuja);
		Ataque canionDeAgua = new AtaqueAgua(20,8, TipoAtaque.CanionDeAgua);
		ataques.put(TipoAtaque.Burbuja,burbuja);
		ataques.put(TipoAtaque.CanionDeAgua,canionDeAgua);
	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarAgua();
	}
}
