package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; // Valor padrão de XP para todos os conteúdos

    private String titulo; // Título do conteúdo
    private String descricao; // Descrição do conteúdo

    // Método abstrato para calcular XP, a ser implementado pelas subclasses
    public abstract double calcularXp();

    // Métodos getters e setters para os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
