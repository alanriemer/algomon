package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

import fiuba.algo3.modelo.ataques.AtaqueFuego;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;


public class Charmander extends Algomon{
	public Charmander(){
		puntosVida = 170;
		puntosVidaActuales = 170;
		Ataque brasas = new AtaqueFuego(16,10);
		Ataque fogonazo = new AtaqueFuego(2,4);
		ataques.put("Brasas",brasas);
		ataques.put("Fogonazo",fogonazo);

	}
	
	public void atacarConBrasas(Algomon enemigo) throws AtaqueNoDisponibleException{
		estadoEfimero.atacar(ataques.get("Brasas"), enemigo);
	}
	
	public void atacarConFogonazo(Algomon enemigo) throws AtaqueNoDisponibleException{
		estadoEfimero.atacar(ataques.get("Fogonazo"), enemigo);
		enemigo.nuevoEstadoPersistente(new EstadoQuemadoAlgomon(enemigo));
	}


	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarFuego();
	}
	
	
}
