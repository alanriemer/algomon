package fiuba.algo3.tests;
import static org.junit.Assert.*;
import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Chansey;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Jigglypuff;
import fiuba.algo3.modelo.algomones.Rattata;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;
public class AtaquesSimplesTest {
	@Test
	public void test01SquirtleAtacaConBurbujaYCanionACharmander() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		int vidaCharmander = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",unCharmander);
		int vidaCharmanderBurbuja = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Canion de Agua",unCharmander);		
		assertEquals(vidaCharmander-vidaCharmanderBurbuja,20);
		assertEquals(unCharmander.getPuntosVidaActuales(),110);
	}
	
	@Test
	public void test02SquirtleAtacaConBurbujaYCanionABulbasaur() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",unBulbasaur);
		int vidaBulbasaurBurbuja = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon("Canion de Agua",unBulbasaur);		
		assertEquals(vidaBulbasaur-vidaBulbasaurBurbuja,5);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),125);
	}
	
	@Test
	public void test03SquirtleAtacaConBurbujaYCanionADemasCriaturas() throws AtaqueNoDisponibleException{
		int danioBurbuja = 0;
		int danioCanion = 0;
		
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		int vidaChansey = unChansey.getPuntosVidaActuales();
		
		unSquirtle.atacarCon("Burbuja",unChansey);
		danioBurbuja = vidaChansey - unChansey.getPuntosVidaActuales();
		unSquirtle.atacarCon("Canion de Agua",unChansey);	
		danioCanion = vidaChansey + danioBurbuja - unChansey.getPuntosVidaActuales();
		
		Rattata unRattata= new Rattata();
		int vidaRattata = unRattata.getPuntosVidaActuales();
		
		unSquirtle.atacarCon("Burbuja",unRattata);
		danioBurbuja = danioBurbuja + (vidaRattata - unRattata.getPuntosVidaActuales());
		unSquirtle.atacarCon("Canion de Agua",unRattata);	
		danioCanion = (vidaRattata + danioBurbuja - unRattata.getPuntosVidaActuales());
		
		Jigglypuff unJigglypuff= new Jigglypuff();
		int vidaJigglypuff = unJigglypuff.getPuntosVidaActuales();
		
		unSquirtle.atacarCon("Burbuja",unJigglypuff);
		danioBurbuja = danioBurbuja + (vidaJigglypuff - unJigglypuff.getPuntosVidaActuales());
		unSquirtle.atacarCon("Canion de Agua",unJigglypuff);	
		danioCanion = (vidaJigglypuff + danioBurbuja - unJigglypuff.getPuntosVidaActuales());
		
		assertEquals(danioBurbuja,30);
		assertEquals(danioCanion,60);
	}
	
	@Test
	public void test04BulbasaurYChanseyAtacanConLatigoCepaASquirtle() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaSquirtle = unSquirtle.getPuntosVidaActuales();
		
		unBulbasaur.atacarCon("Latigo Cepa",unSquirtle);
		int danioBulba = vidaSquirtle - unSquirtle.getPuntosVidaActuales();
		
		unChansey.atacarCon("Latigo Cepa",unSquirtle);
		
		int danioChansey = vidaSquirtle - danioBulba - unSquirtle.getPuntosVidaActuales();
		
		assertEquals(danioBulba,30);
		assertEquals(danioChansey,30);		
	}
	
	@Test
	public void test05BulbasaurYChanseyAtacanConLatigoCepaACharmander() throws AtaqueNoDisponibleException{
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();		
		int vidaCharmander = unCharmander.getPuntosVidaActuales();
		
		unBulbasaur.atacarCon("Latigo Cepa",unCharmander);
		int danioBulba = vidaCharmander - unCharmander.getPuntosVidaActuales();
		
		unChansey.atacarCon("Latigo Cepa",unCharmander);
		
		int danioChansey = vidaCharmander - danioBulba - unCharmander.getPuntosVidaActuales();
		assertEquals(danioBulba,7);
		assertEquals(danioChansey,7);	
		
	}
	
	@Test
	public void test06BulbasaurYChanseyAtacanConLatigoCepaADemasCriaturas() throws AtaqueNoDisponibleException{
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getPuntosVidaActuales();
		
		unBulbasaur.atacarCon("Latigo Cepa",unRattata);
		int danioBulba = vidaRattata - unRattata.getPuntosVidaActuales();
		unChansey.atacarCon("Latigo Cepa", unRattata);
		
		int danioChansey = vidaRattata - danioBulba - unRattata.getPuntosVidaActuales();
		assertEquals(danioBulba,15);
		assertEquals(danioChansey,15);		
	}
	
	@Test
	public void test07CharmanderAtacaConBrasasABulbasaur() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarCon("Brasas",unBulbasaur);
		int danioCharmander = vidaBulbasaur - unBulbasaur.getPuntosVidaActuales();
		assertEquals(danioCharmander,32);
	}
	
	@Test
	public void test08CharmanderAtacaConBrasasASquirtle() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVidaActuales();
		unCharmander.atacarCon("Brasas", unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getPuntosVidaActuales();
		assertEquals(danioCharmander,8);		
	}
	
	@Test
	public void test09CharmanderAtacaConBrasasADemasCriaturas() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getPuntosVidaActuales();
		
		unCharmander.atacarCon("Brasas",unRattata);
		int danioCharmander = vidaRattata - unRattata.getPuntosVidaActuales();
		assertEquals(danioCharmander,16);			
	}
	
	@Test
	public void test10AlgomonesAtacanConAtaqueRapido() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVidaActuales();
		unCharmander.atacarCon("Ataque rapido",unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getPuntosVidaActuales();
		assertEquals(danioCharmander,10);		
	}
	
}