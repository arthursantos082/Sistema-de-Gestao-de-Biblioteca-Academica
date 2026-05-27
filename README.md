# Sistema de Gestão de Biblioteca Acadêmica 
## 1. Objetivo Geral

 Desenvolver um sistema orientado a objetos utilizando a linguagem Java, com foco na gestão de uma biblioteca acadêmica. O sistema deverá aplicar os principais conceitos da Programação Orientada a Objetos (POO) e incluir uma interface textual (console) ou gráfica opcional (Swing ou web) , permitindo que usuários realizem consultas, empréstimos e devoluções de livros de forma funcional e organizada.


## 2. Descrição Geral do Sistema

    O sistema simula o funcionamento de uma biblioteca universitária. Ele deverá permitir que:

    O bibliotecário cadastre usuários da biblioteca (alunos e professores), gerencie o acervo de livros e realize operações de empréstimo e devolução;
    As informações sejam armazenadas e consultadas em tempo de execução utilizando estruturas de dados baseadas em Arrays ou Collections (como ArrayList e HashMap) ou com banco de dados.

## 3. Requisitos Funcionais

O sistema deverá contemplar, no mínimo, as seguintes funcionalidades:

✅ Cadastro de livros: título, autor, ISBN, ano e editora.

✅ Cadastro de usuários: nome, matrícula, tipo (aluno ou professor), CPF e e-mail.

✅ Consulta de disponibilidade de livros.

✅ Empréstimos: número do empréstimo, usuário, livro(s), data e status do empréstimo.

✅ Devolução de livros: atualização do status do empréstimo e da disponibilidade do exemplar.

✅ Listagem de livros: ISBN, título, autor, editora e status (disponível ou emprestado).

## 4. Modelagem UML

Os seguintes diagramas devem ser incluídos no projeto:

    Diagrama de Casos de Uso: deve contemplar o ator Bibliotecário e suas interações com o sistema.
    Diagrama de Classes: deve conter, no mínimo, as seguintes classes:
    Livro
    Usuario (classe base), Aluno, Professor
    Emprestimo
    (Opcional) Diagrama de Sequência: para as operações de empréstimo e devolução.

## 5. Requisitos Técnicos

    Linguagem: Java (JDK 8 ou superior)
    Paradigma: Programação Orientada a Objetos
    IDE sugeridas: BlueJ, Eclipse, IntelliJ IDEA ou Visual Studio Code
    Interface: Texto (console) ou Gráfica (Swing) ou interface web.

