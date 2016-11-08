package fiuba.algo3.modelo;

import java.util.HashMap;

public class CalcularDanio {
	
	public static Tipo devolverTipoDebilAnte(Tipo ataque){
		HashMap<Tipo,Tipo> weakness = new HashMap<Tipo,Tipo>();
		weakness.put(Tipo.Agua, Tipo.Fuego);
		weakness.put(Tipo.Fuego, Tipo.Planta);
		weakness.put(Tipo.Planta, Tipo.Agua);
		return weakness.get(ataque);
	}
	
	public static double calcularMultiplicador(Tipo ataque, Tipo enemigo){
		if (ataque == Tipo.Normal)
			return 1;
		if (enemigo == devolverTipoDebilAnte(ataque))
			return 2;
		return 0.5;
	}
	
	public static int calcularPorTipo(Algomon unAlgomon, Tipo tipo, int potencia, Algomon enemigo){
		double multiplicador = calcularMultiplicador(tipo, enemigo.tipo);
		return (int) Math.floor(potencia * multiplicador);
	}
}
