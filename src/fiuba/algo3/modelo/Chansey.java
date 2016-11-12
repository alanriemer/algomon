package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.ataques.AtaquePlanta;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Chansey extends Algomon {
	public Chansey (){
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque latigoCepa = new AtaquePlanta(15,10);
		Ataque canto = new AtaqueNormal(0,6);
		ataques.put("Latigo Cepa",latigoCepa);
		ataques.put("Canto",canto);
	}

	public void atacarConLatigoCepa(Algomon enemigo) throws AtaqueNoDisponibleException {
		this.estado.atacar(ataques.get("Latigo Cepa"), enemigo);
	}
	
	public void atacarConCanto(Algomon enemigo) throws AtaqueNoDisponibleException {
		this.estado.atacar(ataques.get("Canto"), enemigo);
		enemigo.nuevoEstado(new EstadoDormidoAlgomon(enemigo));
	}
	
	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
}
