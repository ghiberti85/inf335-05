package br.unicamp.ic.inf335.app.inf335_prj04;

public class ProdutoBean implements java.io.Serializable, Comparable<ProdutoBean> {
    private static final long serialVersionUID = 1L;
    
    private String codigo;
    private String nome;
    private String descricao;
    private Double valor;
    private String estado;
    
    // Getters and Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Constructors

    public ProdutoBean() {
        this.codigo = "";
        this.nome = "";
        this.descricao = "";
        this.valor = 0.0;
        this.estado = "";
    }

    public ProdutoBean(String codigo, String nome, String descricao, Double valor, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estado = estado;
    }

    // Methods

    @Override
    public int compareTo(ProdutoBean p) {
        return this.valor.compareTo(p.getValor());
    }
}






