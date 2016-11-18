package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Chansey;
import fiuba.algo3.modelo.algomones.Charmander;
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
		assertEquals(unBulbasaur.estaQuemado(),true);
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
	
	@Test
	public void test08BulbasaurDuermeyLuegoPasaAQuemadoDormidoYLuegoPasaSoloAQuemado() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();
		
		unChansey.atacarCon("Canto",unBulbasaur);
		//Ataques que realiza mientras duerme y no hacen daño
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		//Pasa a quemado dormido
		unCharmander.atacarCon("Fogonazo", unBulbasaur);	
		assertEquals(unBulbasaur.estaDormidoQuemado(),true);
		unBulbasaur.atacarCon("Ataque rapido",unChansey);

		//Despierta y realiza ataque con daño
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		
		assertEquals(unBulbasaur.estaQuemado(),true);
		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unChansey.getPuntosVidaActuales(), 120);
	}
	
	@Test
	public void test09BulbasaurPasaAQuemadoDormidoYRecibeDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Charmander unCharmander = new Charmander();
		Chansey unChansey = new Chansey();
		
		assertEquals(unBulbasaur.estaDormidoQuemado(),false);
		unChansey.atacarCon("Canto",unBulbasaur);			
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		unBulbasaur.atacarCon("Ataque rapido",unChansey);
		unCharmander.atacarCon("Fogonazo", unBulbasaur);	
		assertEquals(unBulbasaur.estaDormidoQuemado(),true);
		int vidaAntes = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Latigo Cepa",unChansey);
		assertEquals(unBulbasaur.estaDormidoQuemado(),false);
		int vidaDespues = unBulbasaur.getPuntosVidaActuales();
		//14 es el 10% de la vida de Bulbasaur (140)
		assertEquals(vidaDespues, vidaAntes-14);
	}
}
