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
		
		unCharmander.atacarConFogonazo(unBulbasaur);
		
		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unBulbasaur.estaQuemado(),true);
	}
	
	@Test
	public void test02BulbasaurEstaDormidoPeroNoQuemadoLuegoDeUnAtaqueCanto() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		
		unChansey.atacarConCanto(unBulbasaur);
		
		assertEquals(unBulbasaur.estaDormido(),true);
		assertEquals(unBulbasaur.estaQuemado(),false);
	}
	
	@Test
	public void test03BulbasaurEstaDormidoYQuemadoLuegoDeDosAtaques() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();		
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();
		
		unCharmander.atacarConFogonazo(unBulbasaur);
		unChansey.atacarConCanto(unBulbasaur);
		
		assertEquals(unBulbasaur.estaDormido(),true);
		assertEquals(unBulbasaur.estaQuemado(),true);
	}
	
}
