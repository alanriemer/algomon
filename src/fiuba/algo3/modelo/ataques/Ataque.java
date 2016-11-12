package fiuba.algo3.modelo.ataques;




public abstract class Ataque {
	int potencia;
	int cantidad;
	boolean bloqueado;
	
	
	public Ataque(int potencia, int cantidad){
		this.potencia = potencia;
		this.cantidad = cantidad;
		this.bloqueado = false;
		
	}
	
	
	public abstract int atacarPlanta();
	public abstract int atacarFuego();
	public abstract int atacarAgua();
	public abstract int atacarNormal();
	
	public boolean sePuedeUsarAtaque(){
		return (cantidad > 0 || bloqueado);
	}

	
	
}
