package fiuba.algo3.modelo;

public class CalcularDanio {
	
	public static int calcularPorTipo(Tipo tipo, int potencia, Algomon enemigo){
		double multiplicador = enemigo.weakAndStr.get(tipo);
		return (int) Math.floor(potencia * multiplicador);
	}
}
