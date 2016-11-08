package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Squirtle extends Algomon{	
	public Squirtle (){
		healthPoints = 150;
		tipo = Tipo.Agua;
		Ataque ataque1 = new Ataque("Burbuja",10,15,Tipo.Agua);
		Ataque ataque2 = new Ataque("Cañoñ de Agua",20,8,Tipo.Agua);
		moveSet.put(1,ataque1);
		moveSet.put(2,ataque2);
	}
	
	public void atacaConBurbujaAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get(1));
	}
	
	public void atacaConCanionDeAguaAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get(2));
	}
}
