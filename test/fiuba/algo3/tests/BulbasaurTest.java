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
		
		int vida = otroBulbasaur.getPuntosVida();
		unBulbasaur.atacarConLatigoCepa(otroBulbasaur);
		
		assertEquals(otroBulbasaur.getPuntosVida(),vida-7);
	}
	
	@Test
	public void test02BulbasaurRealizaAtaqueRapidoContraOtroBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		int vida = otroBulbasaur.getPuntosVida();
		unBulbasaur.atacarConAtaqueRapido(otroBulbasaur);
		
		assertEquals(otroBulbasaur.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test03BulbasaurRealizaLatigoCepaContraSquirtleYHace30deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVida();
		unBulbasaur.atacarConLatigoCepa(otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVida(),vida-30);
	}
	
	@Test
	public void test04BulbasaurRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unBulbasaur.atacarConAtaqueRapido(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test05BulbasaurRealizaLatigoCepaContraCharmanderYHace7deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unBulbasaur.atacarConLatigoCepa(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-7);
	}
	
	@Test
	public void test06BulbasaurRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unBulbasaur.atacarConAtaqueRapido(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test07BulbasaurRealizaLatigoCepaContraRattataYHace15deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unBulbasaur.atacarConLatigoCepa(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-15);
	}
	
	@Test
	public void test08BulbasaurRealizaAtaqueRapidoContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unBulbasaur.atacarConAtaqueRapido(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test09BulbasaurRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unBulbasaur.atacarConAtaqueRapido(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-10);
	}
	
	@Test	
	public void test10BulbasaurRealizaChupaVidasContraSquirtleYHace10deDanioYAumenta30porcSuVida() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVida();
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unBulbasaur.atacarConChupavidas(unSquirtle);
		int nuevaVidaSquirtle = unSquirtle.getPuntosVida();
		int puntosVidaASumar = (int)Math.round((vidaSquirtle - nuevaVidaSquirtle)*0.30);
		assertEquals(unBulbasaur.getPuntosVida(),vidaBulbasaur + puntosVidaASumar);
		assertEquals(unSquirtle.getPuntosVida(),vidaSquirtle-30);
	}
	
	@Test	
	public void test11BulbasaurRealizaChupaVidasContraOtroBulbasaurYHace10deDanioYAumenta30porcSuVida() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		int vidaOtroBulbasaur = otroBulbasaur.getPuntosVida();
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unBulbasaur.atacarConChupavidas(otroBulbasaur);
		int nuevaVidaOtroBulbasaur = otroBulbasaur.getPuntosVida();
		int puntosVidaASumar = (int)Math.round((vidaBulbasaur - nuevaVidaOtroBulbasaur)*0.30);
		assertEquals(unBulbasaur.getPuntosVida(),vidaBulbasaur + puntosVidaASumar);
		assertEquals(otroBulbasaur.getPuntosVida(),vidaOtroBulbasaur-7);
	}	
}
