package br.unicamp.ic.inf335.app.inf335_prj04;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.net.URL;


public class AnuncioBeanTest {
	
	private AnuncioBean anuncio;
	private ProdutoBean produto;
	
	@Before
	public void setUp() throws Exception {
		produto = new ProdutoBean("001", "Produto 1", "Descricao 1",100.0, "Novo");
		anuncio = new AnuncioBean(produto, new ArrayList<URL>(), 0.1);
	}

	@Test
	public void testGetValor() {
		assertEquals(Double.valueOf(90.0), anuncio.getValor(), 0.01);
	}

}
