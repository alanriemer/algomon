package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Jigglypuff extends Algomon{
	public Jigglypuff(){
		puntosVida = 130;
		tipo = Tipo.Normal;
		Ataque burbuja = new Ataque(10,15, Tipo.Agua);
		Ataque canto = new Ataque(0,6, Tipo.Normal);
		moveSet.put("Burbuja",burbuja);
		moveSet.put("Canto",canto);
		weakAndStr.put(Tipo.Agua, 1.0);
		weakAndStr.put(Tipo.Fuego, 1.0);
		weakAndStr.put(Tipo.Planta, 1.0);
		weakAndStr.put(Tipo.Normal, 1.0);		
	}
	
	public void atacarConBurbuja(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(moveSet.get("Burbuja"));
	}

	public void atacarConCanto(Algomon enemigo) throws AtaqueNoDisponibleException {
		enemigo.recibirAtaque(moveSet.get("Canto"));
		
	}
}
