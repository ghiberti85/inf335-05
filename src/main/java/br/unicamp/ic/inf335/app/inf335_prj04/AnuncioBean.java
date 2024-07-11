package br.unicamp.ic.inf335.app.inf335_prj04;

import java.net.URL;
import java.util.ArrayList;

public class AnuncioBean implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    private ProdutoBean produto;
    private ArrayList<URL> fotosUrl;
    private Double desconto;

    // Getters and Setters

    public ProdutoBean getProduto() {
        return produto;
    }

    public void setProduto(ProdutoBean produto) {
        this.produto = produto;
    }

    public ArrayList<URL> getFotosUrl() {
        return fotosUrl;
    }

    public void setFotosUrl(ArrayList<URL> fotosUrl) {
        this.fotosUrl = fotosUrl;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    // Constructors

    public AnuncioBean() {
        this.produto = new ProdutoBean();
        this.fotosUrl = new ArrayList<URL>();
        this.desconto = 0.0;
    }

    public AnuncioBean(ProdutoBean produto, ArrayList<URL> fotosUrl, Double desconto) {
        this.produto = produto;
        this.fotosUrl = fotosUrl;
        this.desconto = desconto;
    }

    // Methods

    public Double getValor() {
        return produto.getValor() * (1 - desconto);
    }
}





