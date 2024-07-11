package br.unicamp.ic.inf335.app.inf335_prj04;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ProdutoBeanTest {
	
	private ProdutoBean produto1;
	private ProdutoBean produto2;
	
	@Before
	public void setUp() {
		produto1 = new ProdutoBean("001","Produto 1","Descricao 1",100.0,"Novo");
		produto2 = new ProdutoBean("002","Produto 2","Descricao 2",200.0,"Usado"); 
	}

	@Test
	public void testCompareTo() {
		assertEquals(-1, produto1.compareTo(produto2));
		assertEquals(1, produto2.compareTo(produto1));
		produto2.setValor(100.0);
		assertEquals(0, produto1.compareTo(produto2));
	}

}
