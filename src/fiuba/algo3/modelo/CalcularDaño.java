package fiuba.algo3.modelo;

public class CalcularDaño {
	
	public static double calcularMultiplicador(Tipo atacante, Tipo enemigo){
		if (atacante == enemigo)
			return 0.5;	
		return 1;
	}
	
	public static int calcularPorTipo(Algomon unAlgomon, Tipo tipo, int potencia, Algomon enemigo){
		double multiplicador = calcularMultiplicador(tipo, enemigo.tipo);
		return (int) Math.floor(potencia * multiplicador);
	}
}
