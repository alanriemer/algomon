package fiuba.algo3.modelo.ataques;



public class AtaquePlanta extends Ataque{

	public AtaquePlanta(int potencia, int cantidad) {
		super(potencia, cantidad);
	}

	@Override
	public int atacarPlanta() {
		return (int) (this.potencia*0.5);
	}

	@Override
	public int atacarFuego() {
		return (int) (this.potencia*0.5);
	}

	@Override
	public int atacarAgua() {
		return this.potencia*2;
	}

	@Override
	public int atacarNormal() {
		return this.potencia;
	}

}
