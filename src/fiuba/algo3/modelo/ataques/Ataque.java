package fiuba.algo3.modelo.ataques;




public abstract class Ataque {
	int potencia;
	int cantidad;
	
	
	public Ataque(int potencia, int cantidad){
		this.potencia = potencia;
		this.cantidad = cantidad;
		
	}
	
	
	public abstract int atacarPlanta();
	public abstract int atacarFuego();
	public abstract int atacarAgua();
	public abstract int atacarNormal();
	
	public boolean sePuedeUsarAtaque(){
		if (cantidad > 0)
			return true;
		return false;
	}

	
	
}
