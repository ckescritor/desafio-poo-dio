package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome; // Nome do desenvolvedor
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // Conteúdos em que o desenvolvedor está inscrito
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // Conteúdos que o desenvolvedor concluiu

    // Método para inscrever o desenvolvedor em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); // Adiciona todos os conteúdos do bootcamp
        bootcamp.getDevsInscritos().add(this); // Adiciona o desenvolvedor à lista de inscritos do bootcamp
    }

    // Método para avançar no progresso do desenvolvedor
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); // Pega o primeiro conteúdo inscrito
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get()); // Adiciona o conteúdo aos concluídos
            this.conteudosInscritos.remove(conteudo.get()); // Remove o conteúdo da lista de inscritos
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!"); // Mensagem de erro se não houver conteúdo inscrito
        }
    }

    // Método para calcular o total de XP do desenvolvedor
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator(); // Cria um iterador para os conteúdos concluídos
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp(); // Calcula o XP de cada conteúdo
            soma += next; // Soma o XP
        }
        return soma; // Retorna a soma total de XP

        /* Alternativa usando Stream API
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }

    // Métodos getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se o objeto é o mesmo
        if (o == null || getClass() != o.getClass()) return false; // Verifica se o objeto é da mesma classe
        Dev dev = (Dev) o; // Faz o cast do objeto para Dev
        return Objects.equals(nome, dev.nome) && // Verifica a igualdade dos nomes
                Objects.equals(conteudosInscritos, dev.conteudosInscritos) && // Verifica a igualdade dos conteúdos inscritos
                Objects.equals(conteudosConcluidos, dev.conteudosConcluidos); // Verifica a igualdade dos conteúdos concluídos
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos); // Calcula o hash baseado nos atributos
    }
}

