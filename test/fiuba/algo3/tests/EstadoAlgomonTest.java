package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Chansey;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoAlgomonTest {
	
	@Test
	public void test01BulbasaurNoEstaDormidoPeroSiQuemadoLuegoDeUnAtaqueFogonazo() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Charmander unCharmander = new Charmander();
		
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		
		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unBulbasaur.estaQuemado(),true);
	}
	
	@Test
	public void test02BulbasaurEstaDormidoPeroNoQuemadoLuegoDeUnAtaqueCanto() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		
		unChansey.atacarCon("Canto",unBulbasaur);
		
		assertEquals(unBulbasaur.estaDormido(),true);
		assertEquals(unBulbasaur.estaQuemado(),false);
	}
	
	@Test
	public void test03BulbasaurEstaDormidoYQuemadoLuegoDeDosAtaques() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();
		
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		unChansey.atacarCon("Canto",unBulbasaur);
		
		assertEquals(unBulbasaur.estaDormido(),true);
		//assertEquals(unBulbasaur.estaQuemado(),true);
	}
	
	@Test
	public void test04BulbasaurRealizaAtaqueRapidoEnEstadoQuemadoYRecibe14deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		int vida = unBulbasaur.getPuntosVidaActuales(); //vidaBulbasaur = 136
		unBulbasaur.atacarCon("Latigo Cepa", unCharmander);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-14);
	}
	
	@Test
	public void test05BulbasaurNoEstaDormidoNiQuemadoLuegoDeUnAtaque() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		
		unChansey.atacarCon("Ataque rapido", unBulbasaur);
		
		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unBulbasaur.estaQuemado(),false);
	}
	
	@Test
	public void test06BulbasaurNoHaceDanioPor3TurnosAlEstarDormido() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		
		unChansey.atacarCon("Canto",unBulbasaur);

		unBulbasaur.atacarCon("Ataque rapido", unChansey);
		unBulbasaur.atacarCon("Ataque rapido", unChansey);
		unBulbasaur.atacarCon("Ataque rapido", unChansey);
				
		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unChansey.getPuntosVidaActuales(), 130);
	}
	
	@Test
	public void test07BulbasaurDespiertaDeEstarDormidoYRealizaAtaqueRapido() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		
		unChansey.atacarCon("Canto",unBulbasaur);
		//Ataques que realiza mientras duerme y no hacen daño
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		unBulbasaur.atacarCon("Ataque rapido",unChansey);

		//Despierta y realiza ataque con daño
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		
		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unChansey.getPuntosVidaActuales(), 120);
	}
}
