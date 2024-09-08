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

## Implementação dos Objetivos do Desafio

### 1. Abstração do Domínio Bootcamp

- **Abstração**: O domínio do Bootcamp foi abstraído criando uma classe `Bootcamp` que representa o conjunto de cursos e mentorias disponíveis. Esta classe inclui atributos como nome, descrição, datas de início e fim, e métodos para gerenciar os desenvolvedores inscritos e os conteúdos do bootcamp.

### 2. Criação e Modelagem das Classes

- **Classes Criadas**:
  - **`Bootcamp`**: Gerencia a inscrição de desenvolvedores e os conteúdos do bootcamp.
  - **`Curso`**: Representa um curso, herda de `Conteudo`, e calcula XP baseado na carga horária.
  - **`Mentoria`**: Representa uma mentoria, herda de `Conteudo`, e calcula XP com um bônus adicional.
  - **`Dev`**: Representa um desenvolvedor, gerencia os conteúdos em que está inscrito e calcula o XP total com base nos conteúdos concluídos.

- **Relacionamentos**:
  - **Bootcamp** contém múltiplos **Conteúdos** (Cursos e Mentorias).
  - **Dev** pode se inscrever em um **Bootcamp** e progredir em seus conteúdos.

### 3. Modelagem dos Atributos e Métodos

- **Abstração**: As classes `Curso` e `Mentoria` herdam da classe abstrata `Conteudo`, que define os atributos e métodos básicos necessários. A classe `Conteudo` tem o método abstrato `calcularXp()`, que é implementado de forma específica em `Curso` e `Mentoria`.

- **Encapsulamento**: Todos os atributos são privados e são acessados e modificados através de métodos públicos (`getters` e `setters`). Isso garante que o acesso aos dados seja controlado.

- **Herança**: A classe `Curso` e `Mentoria` herdam da classe `Conteudo`, permitindo reutilização de código e implementação específica dos métodos.

- **Polimorfismo**: O método `calcularXp()` é um exemplo de polimorfismo. A forma como o XP é calculado varia entre `Curso` e `Mentoria`, mas o método é chamado de forma uniforme através da classe base `Conteudo`.



