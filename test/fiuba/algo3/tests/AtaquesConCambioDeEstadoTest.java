package fiuba.algo3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelos.algomones.Bulbasaur;
import fiuba.algo3.modelos.algomones.Chansey;
import fiuba.algo3.modelos.algomones.Charmander;
import fiuba.algo3.modelos.algomones.Jigglypuff;
import fiuba.algo3.modelos.algomones.Rattata;
import fiuba.algo3.modelos.algomones.Squirtle;

public class AtaquesConCambioDeEstadoTest {

	@Test
	public void jigglypufYChanseyAtacanConCantoYAtacadoNoPuedeAtacarPorTresTurnos() {
		Chansey unChansey= new Chansey();
		Jigglypuff unJigglypuff= new Jigglypuff();
		
		fail("Not yet implemented");
	}
	public void bulbasaurAtacaConChupavidasACharmanderyLeQuita30PuntosYGanaPuntosDeVida() {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();
		fail("Not yet implemented");
	}
	public void bulbasaurAtacaConChupavidasASquirtleYLeQuita7PuntosYGana2PuntosDeVida() {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Squirtle unSquirtle= new Squirtle();
		fail("Not yet implemented");
	}	
	public void bulbasaurAtacaConChupavidasAOtrosAlgomonesYLesQuita15PuntosDeVidayAumenta4PuntosDeVida() {
		Bulbasaur unBulbasaur= new Bulbasaur();
		fail("Not yet implemented");
	}
	public void charmanderYRattataAtacanConFogonazoYElAlgomonAtacadoRecibe10porcientoDeSusPuntosDeVida() {
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		Chansey unChansey= new Chansey();
		fail("Not yet implemented");
	}		
	
}
