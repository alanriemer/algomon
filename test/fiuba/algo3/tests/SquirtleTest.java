package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Rattata;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class SquirtleTest {
	
	@Test
	public void test01SquirtleRealizaBurbujaContraOtroSquirtleYHace5deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVidaActuales(),vida-5);
	}
	
	@Test
	public void test02SquirtleRealizaCanionDeAguaContraOtroSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVidaActuales();
		unSquirtle.atacarCon("Canion de Agua",otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test03SquirtleRealizaAtaqueRapidoContraOtroSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVidaActuales();
		unSquirtle.atacarCon("Ataque rapido",otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test04SquirtleRealizaBurbujaContraCharmanderYHace20deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-20);
	}
	
	@Test
	public void test05SquirtleRealizaCanionDeAguaContraCharmanderYHace40deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Canion de Agua",unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-40);
	}
	
	@Test
	public void test06SquirtleRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Ataque rapido", unCharmander);		
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test07SquirtleRealizaBurbujaContraBulbasaurYHace5deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja", unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-5);
	}
	
	@Test
	public void test08SquirtleRealizaCanionDeAguaContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon("Canion de Agua",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test09SquirtleRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon("Ataque rapido",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}	
	
	@Test
	public void test10SquirtleRealizaBurbujaContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja", unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test11SquirtleRealizaCanionDeAguaContraRattataYHace20deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unSquirtle.atacarCon("Canion de Agua",unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-20);
	}
	
	@Test
	public void test12SquirtleRealizaAtaqueRapidoContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unSquirtle.atacarCon("Ataque rapido",unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test13SquirtleRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon("Ataque rapido",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	
}
