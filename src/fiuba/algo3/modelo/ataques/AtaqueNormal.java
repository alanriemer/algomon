package fiuba.algo3.modelo.ataques;



public class AtaqueNormal extends Ataque{

	public AtaqueNormal(int potencia, int cantidad) {
		super(potencia, cantidad);
	}

	@Override
	public int atacarPlanta() {
		this.cantidad--;
		return this.potencia;
	}

	@Override
	public int atacarFuego() {
		this.cantidad--;
		return this.potencia;
	}

	@Override
	public int atacarAgua() {
		this.cantidad--;
		return this.potencia;
	}

	@Override
	public int atacarNormal() {
		this.cantidad--;
		return this.potencia;
	}

}
