package fiuba.algo3.modelo;

public class Rattata extends Algomon{
	public Rattata(){
		healthPoints = 170;
		tipo = Tipo.Normal;
		weakAndStr.put(Tipo.Agua, 1.0);
		weakAndStr.put(Tipo.Fuego, 1.0);
		weakAndStr.put(Tipo.Planta, 1.0);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
}
