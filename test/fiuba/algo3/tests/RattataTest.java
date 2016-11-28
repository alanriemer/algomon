package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Rattata;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class RattataTest {

	@Test
	public void test01RattataAtacaConFogonazoContaBalbasurYHace4DeDanio() throws AtaqueNoDisponibleException{
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unRattata.atacarCon(TipoAtaque.Fogonazo,unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-4);
	}

	@Test
	public void test02RattataAtacaConBurbujaContraBalbasurYHace5deDanio() throws AtaqueNoDisponibleException{
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unRattata.atacarCon(TipoAtaque.Burbuja,unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-5);
	}


	@Test
	public void test03RattataAtacaConAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unRattata.atacarCon(TipoAtaque.AtaqueRapido,unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}


}
