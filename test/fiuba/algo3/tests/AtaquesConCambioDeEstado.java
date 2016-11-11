package fiuba.algo3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Jigglypuff;
//import fiuba.algo3.modelo.Jigglypuff;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class AtaquesConCambioDeEstado {
	
	/*
	@Test (expected = AtaqueNoDisponibleException.class)
	public void test01JigglypuffyChanseyAtacannConCantoYAlgomonAtacadoNoPuedeAtacarPor3turnos() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Charmander unCharmander = new Charmander();	
		unJigglypuff.atacarConCanto(unCharmander);
		unCharmander.atacarConBrasas(unJigglypuff);
	}*/
	@Test
	public void test02bulbasaurAtacaConChupavidasACharmanderyLeQuita30PuntosYGanaPuntosDeVida() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();
		int vidaCharmander = unCharmander.getPuntosVida();
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unBulbasaur.atacarConChupavidas(unCharmander);
		assertEquals(unBulbasaur.getPuntosVida(),vidaBulbasaur + 2);//Este test está mal en el TP.
		assertEquals(unCharmander.getPuntosVida(),vidaCharmander -7);
	}
	
	@Test	
	public void test03bulbasaurAtacaConChupavidasASquirtleYLeQuita7PuntosYGana2PuntosDeVida() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVida();
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unBulbasaur.atacarConChupavidas(unSquirtle);
		assertEquals(unBulbasaur.getPuntosVida(),vidaBulbasaur + 9);//Este test está mal en el TP.
		assertEquals(unSquirtle.getPuntosVida(),vidaSquirtle -30);
	}	
	
	@Test
	public void test04bulbasaurAtacaConChupavidasAOtrosAlgomonesYLesQuita15PuntosDeVidayAumenta4PuntosDeVida() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vidaRattata = unRattata.getPuntosVida();
		unRattata.atacarConAtaqueRapido(unBulbasaur);
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unBulbasaur.atacarConChupavidas(unRattata);
		assertEquals(unBulbasaur.getPuntosVida(),vidaBulbasaur + 4);
		assertEquals(unRattata.getPuntosVida(),vidaRattata -15);		
	}
	
	
	@Test
	public void test05JigglypuffAtacaConCantoYElCharmanderQuedaEnEstadoDormido() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Charmander unCharmander = new Charmander();	
		unJigglypuff.atacarConCanto(unCharmander);
		assertEquals(unCharmander.estaDormido(), true);
	}
}
