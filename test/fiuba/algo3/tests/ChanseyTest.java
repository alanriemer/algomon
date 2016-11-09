package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Chansey;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class ChanseyTest {
	
	@Test
	public void test01ChanseyRealizaLatigoCepaContraOtroChanseyYHace15deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Chansey otroChansey = new Chansey();
		
		int vida = otroChansey.getPuntosVida();
		unChansey.atacarConLatigoCepa(otroChansey);
		
		assertEquals(otroChansey.getPuntosVida(),vida-15);
	}
	
	@Test
	public void test02ChanseyRealizaLatigoCepaContraSquirtleYHace30deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unChansey.atacarConLatigoCepa(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-30);
	}
	
	@Test
	public void test03ChanseyRealizaLatigoCepaContraCharmanderYHace7deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unChansey.atacarConLatigoCepa(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-7);
	}
	
	@Test
	public void test04ChanseyRealizaLatigoCepaContraBulbasaurYHace7deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unChansey.atacarConLatigoCepa(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-7);
	}
	
	@Test
	public void test05ChanseyRealizaAtaqueRapidoContraOtroChanseyYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Chansey otroChansey = new Chansey();
		
		int vida = otroChansey.getPuntosVida();
		unChansey.atacarConAtaqueRapido(otroChansey);
		
		assertEquals(otroChansey.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test06ChanseyRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unChansey.atacarConAtaqueRapido(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test07ChanseyRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unChansey.atacarConAtaqueRapido(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test08ChanseyRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unChansey.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test09ChanseyRealizaCantoContraBulbasaurYLoDuerme(){
	}

}
