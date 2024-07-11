package br.unicamp.ic.inf335.app.inf335_prj04;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class AnuncianteBeanTest {

    private AnuncianteBean anunciante;
    private AnuncioBean anuncio1;
    private AnuncioBean anuncio2;

    @Before
    public void setUp() {
        anuncio1 = new AnuncioBean(new ProdutoBean("001", "Produto 1", "Descricao 1", 100.0, "Novo"), new ArrayList<>(), 0.1);
        anuncio2 = new AnuncioBean(new ProdutoBean("002", "Produto 2", "Descricao 2", 200.0, "Usado"), new ArrayList<>(), 0.2);
        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);
        anunciante = new AnuncianteBean("João", "12345678900", anuncios);
    }

    @Test
    public void testAddAnuncio() {
        AnuncioBean anuncio3 = new AnuncioBean(new ProdutoBean("003", "Produto 3", "Descricao 3", 300.0, "Novo"), new ArrayList<>(), 0.3);
        anunciante.addAnuncio(anuncio3);
        assertEquals(3, anunciante.getAnuncios().size());
    }

    @Test
    public void testRemoveAnuncio() {
        anunciante.removeAnuncio(0);
        assertEquals(1, anunciante.getAnuncios().size());
    }

    @Test
    public void testValorMedioAnuncios() {
        assertEquals(Double.valueOf(125.0), anunciante.valorMedioAnuncios(), 0.01);
    }

    @Test
    public void testValorMedioAnunciosEmptyList() {
        AnuncianteBean anuncianteVazio = new AnuncianteBean("Maria", "09876543211", new ArrayList<>());
        assertEquals(Double.valueOf(0.0), anuncianteVazio.valorMedioAnuncios(), 0.01);
    }

    @Test
    public void testRemoveAnuncioInvalidIndex() {
        int initialSize = anunciante.getAnuncios().size();
        anunciante.removeAnuncio(-1);
        assertEquals(initialSize, anunciante.getAnuncios().size());
        anunciante.removeAnuncio(initialSize);
        assertEquals(initialSize, anunciante.getAnuncios().size());
    }
}





