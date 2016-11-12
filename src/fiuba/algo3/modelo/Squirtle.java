package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Squirtle extends Algomon{	
	public Squirtle (){
		puntosVida = 150;
		puntosVidaActuales = 150;
		Ataque burbuja = new AtaqueAgua(10,15);
		Ataque canionDeAgua = new AtaqueAgua(20,8);
		ataques.put("Burbuja",burbuja);
		ataques.put("Canion de Agua",canionDeAgua);
	}
	
	public void atacarConBurbuja(Algomon enemigo) throws AtaqueNoDisponibleException{
		this.estado.atacar(ataques.get("Burbuja"), enemigo);
	}
	
	public void atacarConCanionDeAgua(Algomon enemigo) throws AtaqueNoDisponibleException{
		this.estado.atacar(ataques.get("Canion de Agua"), enemigo);
	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarAgua();
	}

}
