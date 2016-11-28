package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.algomones.Algomon;




public abstract class Ataque {
	int potencia;
	int cantidadMaxima;
	int cantidad;
	TipoAtaque tipo;
	Efecto efecto;


	public Ataque(int potencia, int cantidad, TipoAtaque tipo){
		this.tipo = tipo;
		this.potencia = potencia;
		this.cantidad = cantidad;
		this.cantidadMaxima = cantidad;
	}

	public abstract int atacarPlanta();
	public abstract int atacarFuego();
	public abstract int atacarAgua();
	public abstract int atacarNormal();

	public boolean sePuedeUsarAtaque(){
		return (cantidad > 0);
	}

	public int atacar(Algomon pokemon){
		if(this.tieneEfecto())
			this.efecto.aplicarEfecto(pokemon);
		int danio = pokemon.calcularDanio(this);
		pokemon.recibirDanio(danio);
		cantidad--;
		return danio;
	}

	public void puedeDormir(){
		this.efecto = new efectoDormir();
	}

	public void puedeChuparVida(Ataque unAtaque, Algomon pokemon){
		this.efecto = new efectoChupaVidas(unAtaque, pokemon);
	}

	public void puedeQuemar(){
		this.efecto = new efectoQuemar();
	}

	public boolean tieneEfecto(){
		return this.efecto != null;
	}

	public void restaurarAtaque(int cant) {
		if(this.cantidad + cant > this.cantidadMaxima)
			this.cantidad = this.cantidadMaxima;
		else this.cantidad += cant;
	}

	public int cantidadDisponible() {
		return cantidad;
	}
	public TipoAtaque getNombre(){
		return this.tipo;
	}

}
