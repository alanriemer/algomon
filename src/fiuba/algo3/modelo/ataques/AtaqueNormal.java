package fiuba.algo3.modelo.ataques;



public class AtaqueNormal extends Ataque{

	public AtaqueNormal(int potencia, int cantidad) {
		super(potencia, cantidad);
	}

	@Override
	public int atacarPlanta() {
		return this.potencia;
	}

	@Override
	public int atacarFuego() {
		return this.potencia;
	}

	@Override
	public int atacarAgua() {
		return this.potencia;
	}

	@Override
	public int atacarNormal() {
		return this.potencia;
	}

}
