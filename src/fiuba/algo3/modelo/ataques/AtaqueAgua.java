package fiuba.algo3.modelo.ataques;


public class AtaqueAgua extends Ataque{


	public AtaqueAgua(int potencia, int cantidad, TipoAtaque tipo) {
		super(potencia, cantidad, tipo);
	}

	@Override
	public int atacarPlanta() {
		return (int) (this.potencia*0.5);
	}

	@Override
	public int atacarFuego() {
		return this.potencia*2;
	}

	@Override
	public int atacarAgua() {
		return (int) (this.potencia*0.5);
	}

	@Override
	public int atacarNormal() {
		return this.potencia;
	}

}
