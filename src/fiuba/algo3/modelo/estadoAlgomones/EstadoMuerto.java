package fiuba.algo3.modelo.estadoAlgomones;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoMuerto implements Estado{

	@Override
	public void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {

	}

	@Override
	public boolean estaDormido() {
		return false;
	}

	@Override
	public boolean estaQuemado() {
		return false;
	}

	@Override
	public boolean estaDormidoQuemado() {
		return false;
	}

	@Override
	public int turnos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dormir() {

	}

	@Override
	public void quemar() {
	}

	@Override
	public void despertar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aplicarElemento(Elemento elemento) {
	}

	@Override
	public boolean estaMuerto() {
		return true;
	}

}
