package fiuba.algo3.modelo.ataques;


public class AtaqueAgua extends Ataque{


	public AtaqueAgua(int potencia, int cantidad) {
		super(potencia, cantidad);
	}

	@Override
	public int atacarPlanta() {
		this.cantidad--;
		return (int) (this.potencia*0.5);
	}

	@Override
	public int atacarFuego() {
		this.cantidad--;
		return this.potencia*2;
	}

	@Override
	public int atacarAgua() {
		this.cantidad--;
		return (int) (this.potencia*0.5);
	}

	@Override
	public int atacarNormal() {
		this.cantidad--;
		return this.potencia;
	}

}
