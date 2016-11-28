package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Jigglypuff;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class JigglypuffTest {

	@Test
	public void test01JigglypuffRealizaBurbujaContraOtroJigglypuffYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();

		int vida = otroJigglypuff.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.Burbuja,otroJigglypuff);

		assertEquals(otroJigglypuff.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test02JigglypuffRealizaBurbujaContraSquirtleYHace5deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Squirtle unSquirtle = new Squirtle();

		int vida = unSquirtle.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.Burbuja,unSquirtle);

		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-5);
	}

	@Test
	public void test03JigglypuffRealizaBurbujaContraCharmanderYHace20deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Charmander unCharmander = new Charmander();

		int vida = unCharmander.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.Burbuja,unCharmander);

		assertEquals(unCharmander.getPuntosVidaActuales(),vida-20);
	}

	@Test
	public void test04JigglypuffRealizaBurbujaContraBulbasaurYHace5deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.Burbuja,unBulbasaur);

		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-5);
	}

	@Test
	public void test05JigglypuffRealizaAtaqueRapidoContraOtroJigglypuffYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();

		int vida = otroJigglypuff.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.AtaqueRapido,otroJigglypuff);

		assertEquals(otroJigglypuff.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test06JigglypuffRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Squirtle unSquirtle = new Squirtle();

		int vida = unSquirtle.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.AtaqueRapido,unSquirtle);

		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test07JigglypuffRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Charmander unCharmander = new Charmander();

		int vida = unCharmander.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.AtaqueRapido,unCharmander);

		assertEquals(unCharmander.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test08JigglypuffRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff = new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unJigglypuff.atacarCon(TipoAtaque.AtaqueRapido,unBulbasaur);

		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test09JigglypuffAtacaConCantoYElCharmanderQuedaEnEstadoDormido() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Charmander unCharmander = new Charmander();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unCharmander);
		assertEquals(unCharmander.estaDormido(), true);
	}

}
