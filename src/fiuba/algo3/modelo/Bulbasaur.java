package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		tipo = Tipo.Planta;
		puntosVida = 140;
		Ataque latigoCepa = new Ataque(15,10, Tipo.Planta);
		Ataque chupaVidas = new Ataque(15,8, Tipo.Planta);
		moveSet.put("Latigo Cepa",latigoCepa);
		moveSet.put("ChupaVidas",chupaVidas);
		weakAndStr.put(Tipo.Agua, 0.5);
		weakAndStr.put(Tipo.Fuego, 2.0);
		weakAndStr.put(Tipo.Planta, 0.5);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	public void atacarConLatigoCepa(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(moveSet.get("Latigo Cepa"));
	}
	public void atacarConChupavidas(Algomon enemigo) throws AtaqueNoDisponibleException{
		int vidaEnemigo = enemigo.getPuntosVida();
		enemigo.recibirAtaque(moveSet.get("ChupaVidas"));
		int danioEnemigo = vidaEnemigo - enemigo.getPuntosVida();
		this.puntosVida = (int) (this.puntosVida+ Math.ceil(danioEnemigo*0.03));//Redondeo
	}	
}
