package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueFuego;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Rattata extends Algomon{
	public Rattata(){
		puntosVida = 170;
		puntosVidaActuales = 170;
		Ataque fogonazo = new AtaqueFuego(2,4);
		Ataque burbuja = new AtaqueAgua(10,15);
		ataques.put("Fogonazo",fogonazo);
		ataques.put("Burbuja",burbuja);
	
	}
	
	
	public void atacarConFogonazo(Algomon enemigo) throws AtaqueNoDisponibleException{
		this.estadoEfimero.atacar(ataques.get("Fogonazo"), enemigo);
	}
	
	public void atacarConBurbuja(Algomon enemigo) throws AtaqueNoDisponibleException{
		this.estadoEfimero.atacar(ataques.get("Burbuja"), enemigo);
	}


	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
	
	
}
