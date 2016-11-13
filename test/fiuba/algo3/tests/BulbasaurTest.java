package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class BulbasaurTest {
	
	@Test
	public void test01BulbasaurRealizaLatigoCepaContraOtroBulbasaurYHace7deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		int vida = otroBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Latigo Cepa",otroBulbasaur);
		
		assertEquals(otroBulbasaur.getPuntosVidaActuales(),vida-7);
	}
	
	@Test
	public void test02BulbasaurRealizaAtaqueRapidoContraOtroBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		int vida = otroBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Ataque rapido",otroBulbasaur);
		
		assertEquals(otroBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test03BulbasaurRealizaLatigoCepaContraSquirtleYHace30deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Latigo Cepa", otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVidaActuales(),vida-30);
	}
	
	@Test
	public void test04BulbasaurRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Ataque rapido",unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test05BulbasaurRealizaLatigoCepaContraCharmanderYHace7deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Latigo Cepa",unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-7);
	}
	
	@Test
	public void test06BulbasaurRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Ataque rapido",unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test07BulbasaurRealizaLatigoCepaContraRattataYHace15deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Latigo Cepa",unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-15);
	}
	
	@Test
	public void test08BulbasaurRealizaAtaqueRapidoContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Ataque rapido",unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test09BulbasaurRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Ataque rapido",unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test	
	public void test10BulbasaurRealizaChupaVidasContraSquirtleYHace30deDanioYAumenta30porcSuVida() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVidaActuales();
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon("ChupaVidas",unSquirtle);
				
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur);
		assertEquals(unSquirtle.getPuntosVidaActuales(),vidaSquirtle-30);
	}
	
	@Test	
	public void test11BulbasaurRealizaChupaVidasContraOtroBulbasaurYHace7deDanioYAumenta30porcSuVida() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		otroBulbasaur.atacarCon("Ataque rapido",unBulbasaur);
		int vidaOtroBulbasaur = otroBulbasaur.getPuntosVidaActuales();
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon("ChupaVidas",otroBulbasaur);
				
		int nuevaVidaOtroBulbasaur = otroBulbasaur.getPuntosVidaActuales();
		int puntosVidaASumar = (int)Math.floor((vidaOtroBulbasaur - nuevaVidaOtroBulbasaur)*0.30);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur + puntosVidaASumar);
		assertEquals(otroBulbasaur.getPuntosVidaActuales(),vidaOtroBulbasaur-7);
	}
}
