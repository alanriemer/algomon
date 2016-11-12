package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class SquirtleTest {
	
	@Test
	public void test01SquirtleRealizaBurbujaContraOtroSquirtleYHace5deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVidaActuales();
		unSquirtle.atacarConBurbuja(otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVidaActuales(),vida-5);
	}
	
	@Test
	public void test02SquirtleRealizaCanionDeAguaContraOtroSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVidaActuales();
		unSquirtle.atacarConCanionDeAgua(otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test03SquirtleRealizaAtaqueRapidoContraOtroSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVidaActuales();
		unSquirtle.atacarConAtaqueRapido(otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test04SquirtleRealizaBurbujaContraCharmanderYHace20deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarConBurbuja(unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-20);
	}
	
	@Test
	public void test05SquirtleRealizaCanionDeAguaContraCharmanderYHace40deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarConCanionDeAgua(unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-40);
	}
	
	@Test
	public void test06SquirtleRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarConAtaqueRapido(unCharmander);		
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test07SquirtleRealizaBurbujaContraBulbasaurYHace5deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarConBurbuja(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-5);
	}
	
	@Test
	public void test08SquirtleRealizaCanionDeAguaContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarConCanionDeAgua(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test09SquirtleRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}	
	
	@Test
	public void test10SquirtleRealizaBurbujaContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unSquirtle.atacarConBurbuja(unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test11SquirtleRealizaCanionDeAguaContraRattataYHace20deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unSquirtle.atacarConCanionDeAgua(unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-20);
	}
	
	@Test
	public void test12SquirtleRealizaAtaqueRapidoContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unSquirtle.atacarConAtaqueRapido(unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test13SquirtleRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	
}
