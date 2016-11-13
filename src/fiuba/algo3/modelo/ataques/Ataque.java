package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.Algomon;




public abstract class Ataque {
	String nombre; 
	int potencia;
	int cantidad;

	public Ataque(String nombre,int potencia, int cantidad){
		this.potencia = potencia;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}
	public void modificarEstado(Algomon enemigo) {
		if (this.getNombre() == "Canto") enemigo.dormir();
		if (this.getNombre() == "Fogonazo") enemigo.quemar();		
	}	
	public String getNombre(){
		return this.nombre;
	}
	public abstract int atacarPlanta();
	public abstract int atacarFuego();
	public abstract int atacarAgua();
	public abstract int atacarNormal();
	public boolean sePuedeUsarAtaque(){
		return (cantidad > 0);
	}

	



	
	
}
