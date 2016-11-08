package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.*;

public class Burbuja extends Ataque{
	public Burbuja (){
		potencia = 10;
		cantidad = 15;
		tipo = Tipo.Agua;
	}

	@Override
	public void usarAtaque(Algomon unAlgomon, Algomon enemigo) {
		enemigo.hacerDanio(CalcularDanio.calcularPorTipo(unAlgomon, this.tipo, potencia, enemigo));
	}
}
