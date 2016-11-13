package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;

public class Squirtle extends Algomon{	
	public Squirtle (){
		puntosVida = 150;
		puntosVidaActuales = 150;
		Ataque burbuja = new AtaqueAgua("Burbuja",10,15);
		Ataque canionDeAgua = new AtaqueAgua("Canion de Agua",20,8);
		ataques.put("Burbuja",burbuja);
		ataques.put("Canion de Agua",canionDeAgua);
	}
	
	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarAgua();
	}

}
