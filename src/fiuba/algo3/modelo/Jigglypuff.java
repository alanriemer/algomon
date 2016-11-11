package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Jigglypuff extends Algomon{
	public Jigglypuff(){
		puntosVida = 130;
		Ataque burbuja = new AtaqueAgua(10,15);
		Ataque canto = new AtaqueNormal(0,6);
		ataques.put("Burbuja",burbuja);
		ataques.put("Canto",canto);
	
	}
	
	public void atacarConBurbuja(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(ataques.get("Burbuja"));
	}

	public void atacarConCanto(Algomon enemigo) throws AtaqueNoDisponibleException {
		enemigo.recibirAtaque(ataques.get("Canto"));
	}
	
	@Override
	public int recibirAtaque(Ataque unAtaque) {
		if(unAtaque.sePuedeUsarAtaque()){
			int danio = unAtaque.atacarNormal();
			this.recibirDanio(danio);
			return danio;
		}
		return 0;
	}
}
