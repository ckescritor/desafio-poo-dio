package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data; // Data da mentoria

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // Calcula XP adicionando um valor extra para mentorias
    }

    public Mentoria() {
    }

    // Métodos getters e setters para a data
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}'; // Retorna uma representação da mentoria como string
    }
}
