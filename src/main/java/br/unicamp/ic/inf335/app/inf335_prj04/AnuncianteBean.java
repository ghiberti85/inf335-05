package br.unicamp.ic.inf335.app.inf335_prj04;

import java.util.ArrayList;

public class AnuncianteBean {
    private String nome;
    private String CPF;
    private ArrayList<AnuncioBean> anuncios;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public ArrayList<AnuncioBean> getAnuncios() {
        return anuncios;
    }
    public void setAnuncios(ArrayList<AnuncioBean> anuncios) {
        this.anuncios = anuncios;
    }

    public AnuncianteBean() {
        nome = new String();
        CPF = new String();
        anuncios = new ArrayList<AnuncioBean>();
    }

    public AnuncianteBean(String nome, String cPF, ArrayList<AnuncioBean> anuncios) {
        super();
        this.nome = nome;
        CPF = cPF;
        this.anuncios = anuncios;
    }

    public void addAnuncio(AnuncioBean nAnuncio) {
        anuncios.add(nAnuncio);
    }

    public void removeAnuncio(int i) {
        if (i >= 0 && i < anuncios.size()) {
            anuncios.remove(i);
        }
    }

    public Double valorMedioAnuncios() {
        if (anuncios.isEmpty()) {
            return 0.0;
        }
        Double soma = 0.0;
        for (AnuncioBean an : anuncios) {
            soma += an.getValor();
        }
        return soma / anuncios.size();
    }
}

