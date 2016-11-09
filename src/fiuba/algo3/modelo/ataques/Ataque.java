package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.Tipo;

public class Ataque {
	int potencia;
	int cantidad;
	Tipo tipo;
	
	public Ataque(int potencia, int cantidad, Tipo t){
		this.potencia = potencia;
		this.cantidad = cantidad;
		this.tipo = t;
	}
	
	public boolean sePuedeUsarAtaque(){
		if (cantidad > 0)
			return true;
		return false;
	}
	
	public int usarAtaque(){
		cantidad--;
		return potencia;
	}
	
	public Tipo tipoDeAtaque(){
		return tipo;
	}
}
