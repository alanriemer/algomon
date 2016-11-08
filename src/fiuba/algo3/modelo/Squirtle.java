package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Squirtle extends Algomon{	
	public Squirtle (){
		healthPoints = 150;
		tipo = Tipo.Agua;
		Ataque ataque1 = new Ataque("Burbuja",10,15,Tipo.Agua);
		Ataque ataque2 = new Ataque("Cañoñ de Agua",20,8,Tipo.Agua);
		moveList.put(1,ataque1);
		moveList.put(2,ataque2);
	}
	
	public void atacaConBurbujaAlEnemigo(Algomon enemigo){
		moveList.get(1).usarAtaque(this, enemigo);
	}
	
	public void atacaConCanionDeAguaAlEnemigo(Algomon enemigo){
		moveList.get(2).usarAtaque(this, enemigo);
	}
}
