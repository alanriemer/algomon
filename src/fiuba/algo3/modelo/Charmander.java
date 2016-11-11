package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

import fiuba.algo3.modelo.ataques.AtaqueFuego;


public class Charmander extends Algomon{
	public Charmander(){
		puntosVida = 170;
		Ataque brasas = new AtaqueFuego(16,10);
		Ataque fogonazo = new AtaqueFuego(2,4);
		ataques.put("Brasas",brasas);
		ataques.put("Fogonazo",fogonazo);

	}
	
	public void atacarConBrasas(Algomon enemigo){
		enemigo.recibirAtaque(ataques.get("Brasas"));
	}
	
	public void atacarConFogonazo(Algomon enemigo){
		enemigo.recibirAtaque(ataques.get("Fogonazo"));
		enemigo.nuevoEstadoPersistente(new EstadoQuemadoAlgomon(enemigo));
	}

	@Override
	public int recibirAtaque(Ataque unAtaque) {
		if(unAtaque.sePuedeUsarAtaque()){
			int danio = unAtaque.atacarFuego();
			this.recibirDanio(danio);
			return danio;
		}
		return 0;
	}
	
	
}
