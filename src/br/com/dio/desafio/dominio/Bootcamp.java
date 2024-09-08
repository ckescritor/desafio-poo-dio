package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome; // Nome do bootcamp
    private String descricao; // Descrição do bootcamp
    private final LocalDate dataInicial = LocalDate.now(); // Data inicial do bootcamp (data atual)
    private final LocalDate dataFinal = dataInicial.plusDays(45); // Data final do bootcamp (45 dias após a data inicial)
    private Set<Dev> devsInscritos = new HashSet<>(); // Conjunto de desenvolvedores inscritos no bootcamp
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); // Conjunto de conteúdos do bootcamp

    // Métodos getters e setters para os atributos
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

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se o objeto é o mesmo
        if (o == null || getClass() != o.getClass()) return false; // Verifica se o objeto é da mesma classe
        Bootcamp bootcamp = (Bootcamp) o; // Faz o cast do objeto para Bootcamp
        return Objects.equals(nome, bootcamp.nome) && // Verifica a igualdade dos nomes
                Objects.equals(descricao, bootcamp.descricao) && // Verifica a igualdade das descrições
                Objects.equals(dataInicial, bootcamp.dataInicial) && // Verifica a igualdade das datas iniciais
                Objects.equals(dataFinal, bootcamp.dataFinal) && // Verifica a igualdade das datas finais
                Objects.equals(devsInscritos, bootcamp.devsInscritos) && // Verifica a igualdade dos desenvolvedores inscritos
                Objects.equals(conteudos, bootcamp.conteudos); // Verifica a igualdade dos conteúdos
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos); // Calcula o hash baseado nos atributos
    }
}
