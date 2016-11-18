package fiuba.algo3.modelo;

import java.util.Stack;

public class ContenedorElementos {
	
	Stack<Elemento> misPociones;
	Stack<Elemento> miSuperPociones;
	
	public ContenedorElementos(){
		this.misPociones = new Stack<Elemento>();
		this.misPociones.push(new Pocion());
		this.misPociones.push(new Pocion());
		this.misPociones.push(new Pocion());
		this.misPociones.push(new Pocion());
		this.miSuperPociones = new Stack<Elemento>();
		this.miSuperPociones.push(new SuperPocion());
		this.miSuperPociones.push(new SuperPocion());
	}

	public Elemento sacarPocion() {
		return this.misPociones.pop();
	}

	public Elemento sacarSuperPocion() {
		return this.miSuperPociones.pop();
	}



}
