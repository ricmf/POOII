package teste;

import static org.junit.Assert.*;

import modelo.CartorioEleitoral;
import modelo.ZonaEleitoral;

import org.junit.Before;
import org.junit.Test;

public class TesteZonaEleitoral {

	private CartorioEleitoral cartorio;
	
	@Before
	public void setup() {
		cartorio = new CartorioEleitoral();
	}
	
	@Test
	public void cadastraZona101DuasVezes() {
		cartorio.cadastraZonaEleitoral(101, "Estreito");
		assertEquals(1, cartorio.numeroDeZonasEleitorais());
		ZonaEleitoral zona0 = cartorio.getZonas(101);
		assertEquals(101, zona0.getNumero());

		cartorio.cadastraZonaEleitoral(101, "Estreito");
		assertEquals(1, cartorio.numeroDeZonasEleitorais());
	}
	
	@Test
	public void cadastraZona101E102() {

		cartorio.cadastraZonaEleitoral(101, "Estreito");
		assertEquals(1, cartorio.numeroDeZonasEleitorais());
		ZonaEleitoral zona0 = cartorio.getZonas(101);
		assertEquals(101, zona0.getNumero());

		cartorio.cadastraZonaEleitoral(101, "Estreito");
		assertEquals(1, cartorio.numeroDeZonasEleitorais());

		cartorio.cadastraZonaEleitoral(102, "Centro");
		assertEquals(2, cartorio.numeroDeZonasEleitorais());
		ZonaEleitoral zona1 = cartorio.getZonas(102);
		assertEquals(102, zona1.getNumero());
	}
	
	@Test
	public void cadastraSecao() {
		cartorio.cadastraSecao(1);
		assertEquals(1, cartorio.numeroDeSecoes());
	}

}

