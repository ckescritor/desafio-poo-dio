package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria; // Carga horária do curso

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; // Calcula XP baseado na carga horária
    }

    public Curso() {
    }

    // Métodos getters e setters para a carga horária
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}'; // Retorna uma representação do curso como string
    }
}

