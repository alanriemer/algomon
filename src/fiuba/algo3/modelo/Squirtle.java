package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Squirtle extends Algomon{	
	public Squirtle (){
		tipo = Tipo.Agua;
		puntosVida = 150;
		Ataque burbuja = new Ataque(10,15, Tipo.Agua);
		Ataque canionDeAgua = new Ataque(20,8,Tipo.Agua);
		moveSet.put("Burbuja",burbuja);
		moveSet.put("Canion de Agua",canionDeAgua);
		weakAndStr.put(Tipo.Agua, 0.5);
		weakAndStr.put(Tipo.Fuego, 0.5);
		weakAndStr.put(Tipo.Planta, 2.0);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	public void atacarConBurbuja(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(moveSet.get("Burbuja"));
	}
	
	public void atacarConCanionDeAgua(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(moveSet.get("Canion de Agua"));
	}
}
