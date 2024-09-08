import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um curso de Java
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java"); // Definindo o título do curso
        curso1.setDescricao("Descrição Curso Java"); // Definindo a descrição do curso
        curso1.setCargaHoraria(8); // Definindo a carga horária do curso

        // Criando um curso de JavaScript
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS"); // Definindo o título do curso
        curso2.setDescricao("Descrição Curso JS"); // Definindo a descrição do curso
        curso2.setCargaHoraria(4); // Definindo a carga horária do curso

        // Criando uma mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java"); // Definindo o título da mentoria
        mentoria.setDescricao("Descrição Mentoria Java"); // Definindo a descrição da mentoria
        mentoria.setData(LocalDate.now()); // Definindo a data da mentoria como a data atual

        // Criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer"); // Definindo o nome do bootcamp
        bootcamp.setDescricao("Descrição Bootcamp Java Developer"); // Definindo a descrição do bootcamp
        bootcamp.getConteudos().add(curso1); // Adicionando o curso de Java ao bootcamp
        bootcamp.getConteudos().add(curso2); // Adicionando o curso de JavaScript ao bootcamp
        bootcamp.getConteudos().add(mentoria); // Adicionando a mentoria ao bootcamp

        // Criando um desenvolvedor chamado Camila
        Dev devCamila = new Dev();
        devCamila.setNome("Camila"); // Definindo o nome do desenvolvedor
        devCamila.inscreverBootcamp(bootcamp); // Inscrevendo Camila no bootcamp
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos()); // Mostra os conteúdos em que Camila está inscrita
        devCamila.progredir(); // Camila avança em seu progresso
        devCamila.progredir(); // Camila avança mais uma vez
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos()); // Mostra os conteúdos restantes
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos()); // Mostra os conteúdos concluídos
        System.out.println("XP:" + devCamila.calcularTotalXp()); // Mostra a quantidade total de XP

        System.out.println("-------");

        // Criando um desenvolvedor chamado João
        Dev devJoao = new Dev();
        devJoao.setNome("João"); // Definindo o nome do desenvolvedor
        devJoao.inscreverBootcamp(bootcamp); // Inscrevendo João no bootcamp
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos()); // Mostra os conteúdos em que João está inscrito
        devJoao.progredir(); // João avança em seu progresso
        devJoao.progredir(); // João avança mais uma vez
        devJoao.progredir(); // João avança mais uma vez
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos()); // Mostra os conteúdos restantes
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos()); // Mostra os conteúdos concluídos
        System.out.println("XP:" + devJoao.calcularTotalXp()); // Mostra a quantidade total de XP
    }
}
