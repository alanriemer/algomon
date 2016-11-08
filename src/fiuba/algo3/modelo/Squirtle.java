package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Squirtle extends Algomon{	
	public Squirtle (){
		healthPoints = 150;
		tipo = Tipo.Agua;
		Ataque ataque1 = new Ataque("Burbuja",10,15,Tipo.Agua);
		Ataque ataque2 = new Ataque("Canion de Agua",20,8,Tipo.Agua);
		moveSet.put("Burbuja",ataque1);
		moveSet.put("Canion de Agua",ataque2);
	}
	
	public void atacaConBurbujaAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Burbuja"));
	}
	
	public void atacaConCanionDeAguaAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Canion de Agua"));
	}
}
