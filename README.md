# README - Projeto de Bootcamp

## Descrição

Este projeto simula um sistema de **Bootcamp** para desenvolvedores, utilizando conceitos de programação orientada a objetos. Ele inclui a gestão de cursos, mentorias e desenvolvedores.

### Funcionalidades

- **Bootcamp**: Gerencia cursos e mentorias, e inscreve desenvolvedores.
- **Curso**: Representa um curso com carga horária e calcula XP (pontos de experiência) baseado na carga horária.
- **Mentoria**: Representa uma mentoria com uma data específica e calcula XP adicional.
- **Dev**: Gerencia os conteúdos inscritos e concluídos por um desenvolvedor e calcula o XP total.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

1. **`Main.java`**: Ponto de entrada do programa. Configura e testa o funcionamento das classes.
2. **`Bootcamp.java`**: Representa o Bootcamp e contém informações sobre o nome, descrição, data e conteúdos.
3. **`Conteudo.java`**: Classe abstrata que define os atributos e métodos básicos para os conteúdos (Curso e Mentoria).
4. **`Curso.java`**: Representa um curso e herda de `Conteudo`. Calcula XP baseado na carga horária.
5. **`Dev.java`**: Representa um desenvolvedor, gerencia os conteúdos inscritos e concluídos, e calcula o XP total.
6. **`Mentoria.java`**: Representa uma mentoria e herda de `Conteudo`. Calcula XP com um bônus adicional.

## Dependências

Nenhuma dependência externa é necessária para este projeto.

## Configuração e Execução

Para executar o projeto, siga estes passos:

1. **Clone o repositório:**
   ```bash
   git clone <URL_DO_REPOSITORIO>

