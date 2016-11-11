package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaquePlanta;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		puntosVida = 140;
		Ataque latigoCepa = new AtaquePlanta(15,10);
		Ataque chupaVidas = new AtaquePlanta(15,8);
		ataques.put("Latigo Cepa",latigoCepa);
		ataques.put("ChupaVidas",chupaVidas);
		
	}
	
	public void atacarConLatigoCepa(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(ataques.get("Latigo Cepa"));
	}
	
	public void atacarConChupavidas(Algomon enemigo) throws AtaqueNoDisponibleException{
		int danioEnemigo = enemigo.recibirAtaque(ataques.get("ChupaVidas"));
		this.aumentarPuntosDeVida((int)Math.floor(danioEnemigo*0.3));
	}
	
	public void aumentarPuntosDeVida(int puntos){
		if(this.puntosVida + puntos > 140)
			this.puntosVida = 140;
		this.puntosVida += puntos;
	}
	 

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarPlanta();
	}
}
