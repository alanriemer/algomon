package fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.List;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public interface Juego {
	public void atacarCon(TipoAtaque ataque) throws AtaqueNoDisponibleException;
	public void cambiarAlgomonJugadorActual(Algomon algomon);
	public List<Ataque> ataquesDisponiblesAlgomonActual();
	public List<Algomon> algomonesDisponibles();
	public void aplicarElemento(Elemento elemento);
	public HashMap<String, Integer> cantElementos();
	public int getPuntosVidaActualJugador1();
	public int getPuntosVidaActualJugador2();
	public int getPuntosVidaOriginalJugador1();
	public int getPuntosVidaOriginalJugador2();
	public void setNombreJugador1(String nombre);
	public void setNombreJugador2(String nombre);
	public String getNombreJugadorActual();
	public String getNombreJugador1();
	public String getNombreJugador2();
	public boolean faltaQueEligaAlgunaJugador(); //Quitar? Arreglar nombre si no.
	public void jugadorActualYaEligio(); //Quitar? Que lo haga el Controlador?
	public Jugador getJugador1();// Quitar?
	public Jugador getJugador2(); // Quitar?
	public Jugador getJugadorActual(); //Quitar?
}
