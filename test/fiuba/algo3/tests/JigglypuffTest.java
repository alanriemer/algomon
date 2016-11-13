package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Jigglypuff;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class JigglypuffTest {
	
	@Test
	public void test01JigglypuffRealizaBurbujaContraOtroJigglypuffYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();
		
		int vida = otroJigglypuff.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Burbuja",otroJigglypuff);
		
		assertEquals(otroJigglypuff.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test02JigglypuffRealizaBurbujaContraSquirtleYHace5deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Burbuja",unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-5);
	}
	
	@Test
	public void test03JigglypuffRealizaBurbujaContraCharmanderYHace20deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Burbuja",unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-20);
	}
	
	@Test
	public void test04JigglypuffRealizaBurbujaContraBulbasaurYHace5deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Burbuja",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-5);
	}
	
	@Test
	public void test05JigglypuffRealizaAtaqueRapidoContraOtroJigglypuffYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();
		
		int vida = otroJigglypuff.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Ataque rapido",otroJigglypuff);
		
		assertEquals(otroJigglypuff.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test06JigglypuffRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Ataque rapido",unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test07JigglypuffRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Ataque rapido",unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test08JigglypuffRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unJigglypuff.atacarCon("Ataque rapido",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test09JigglypuffAtacaConCantoYElCharmanderQuedaEnEstadoDormido() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Charmander unCharmander = new Charmander();	
		unJigglypuff.atacarCon("Canto",unCharmander);
		assertEquals(unCharmander.estaDormido(), true);
	}

}
