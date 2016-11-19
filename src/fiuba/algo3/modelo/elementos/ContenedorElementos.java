package fiuba.algo3.modelo.elementos;

import java.util.Stack;

public class ContenedorElementos {
	
	Stack<Elemento> misPociones;
	Stack<Elemento> miSuperPociones;
	Stack<Elemento> misRestauradores;
	
	public ContenedorElementos(){
		this.misPociones = new Stack<Elemento>();
		this.misPociones.push(new Pocion());
		this.misPociones.push(new Pocion());
		this.misPociones.push(new Pocion());
		this.misPociones.push(new Pocion());
		
		this.miSuperPociones = new Stack<Elemento>();
		this.miSuperPociones.push(new SuperPocion());
		this.miSuperPociones.push(new SuperPocion());
		
		this.misRestauradores = new Stack<Elemento>();
		this.misRestauradores.push(new Restaurador());
		this.misRestauradores.push(new Restaurador());
		this.misRestauradores.push(new Restaurador());
	}

	public Elemento sacarPocion() {
		return this.misPociones.pop();
	}

	public Elemento sacarSuperPocion() {
		return this.miSuperPociones.pop();
	}

	public Elemento sacarRestaurador() {
		return this.misRestauradores.pop();
	}



}
