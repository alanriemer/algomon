package fiuba.algo3.modelo;

public class CalcularDanio {
	
	public static double calcularMultiplicador(Tipo ataque, Tipo enemigo){
		if (ataque == Tipo.Normal)
			return 1;
		return 0.5;
	}
	
	public static int calcularPorTipo(Algomon unAlgomon, Tipo tipo, int potencia, Algomon enemigo){
		double multiplicador = calcularMultiplicador(tipo, enemigo.tipo);
		return (int) Math.floor(potencia * multiplicador);
	}
}
