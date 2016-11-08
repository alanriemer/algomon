package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.Algomon;
import fiuba.algo3.modelo.CalcularDanio;
import fiuba.algo3.modelo.Tipo;

public class Ataque {
	String nombre;
	int potencia;
	int cantidad;
	Tipo tipo;
	
	public Ataque (String nombre, int potencia, int cantidad, Tipo tipo){
		this.nombre = nombre;
		this.potencia = potencia;
		this.cantidad = cantidad;
		this.tipo = tipo;
	}
	
	public void usarAtaque (Algomon enemigo){
		if (cantidad > 0){ 
			enemigo.hacerDanio(CalcularDanio.calcularPorTipo(this.tipo, potencia, enemigo));
			cantidad--;
		}
	}
}
