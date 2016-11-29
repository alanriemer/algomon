package fiuba.algo3.modelo.elementos;

import java.util.Stack;

import fiuba.algo3.modelo.excepciones.ElementoNoDisponibleException;

public class ContenedorElementos {

	Stack<Elemento> misPociones;
	Stack<Elemento> miSuperPociones;
	Stack<Elemento> misRestauradores;
	Stack<Elemento> misVitaminas;

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

		this.misVitaminas = new Stack<Elemento>();
		this.misVitaminas.push(new Vitamina());
		this.misVitaminas.push(new Vitamina());
		this.misVitaminas.push(new Vitamina());
		this.misVitaminas.push(new Vitamina());
		this.misVitaminas.push(new Vitamina());

	}

	public Elemento sacarPocion() throws ElementoNoDisponibleException {
		try{
				return this.misPociones.pop();
		}
		catch(java.util.EmptyStackException e){
			throw new ElementoNoDisponibleException();
		}
	}

	public Elemento sacarSuperPocion() throws ElementoNoDisponibleException {
		try{
			return this.miSuperPociones.pop();
		}
		catch(java.util.EmptyStackException e){
			throw new ElementoNoDisponibleException();
		}
	}

	public Elemento sacarRestaurador() throws ElementoNoDisponibleException {
		try{
			return this.misRestauradores.pop();
		}
		catch(java.util.EmptyStackException e){
			throw new ElementoNoDisponibleException();
		}
	}

	public Elemento sacarVitamina() throws ElementoNoDisponibleException {
		try{
			return this.misVitaminas.pop();
		}
		catch(java.util.EmptyStackException e){
			throw new ElementoNoDisponibleException();
		}
	}
		

	public Integer cantPocion() {
		return this.misPociones.size();
	}

	public Integer cantVitamina() {
		return this.misRestauradores.size();
	}

	public Integer cantRestaurador() {
		return this.misRestauradores.size();
	}

	public Integer cantSuperPocion() {
		return this.miSuperPociones.size();
	}



}
