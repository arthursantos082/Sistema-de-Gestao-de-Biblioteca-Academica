package application;

import entities.Emprestimo;
import entities.Livro;
import entities.Usuario;
import entities.Aluno;
import entities.Professor;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Chave: CPF do usuário
        Map<String, Usuario> usuarios = new HashMap<>();

        // Chave: ISBN do livro
        Map<Integer, Livro> livros = new HashMap<>();

        // Chave: número do empréstimo (gerado automaticamente)
        Map<Integer, Emprestimo> emprestimos = new HashMap<>();

        int contadorEmprestimo = 1;

        int opcao;
        do {
            System.out.println("\n=============================");
            System.out.println("   SISTEMA DE BIBLIOTECA");
            System.out.println("=============================");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Consultar Empréstimo");
            System.out.println("6. Listar Todos os Livros");
            System.out.println("7. Consultar Disponibilidade de Livro");
            System.out.println("8. Exibir Dados de Usuário");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                // CADASTRO DE USUÁRIO
                case 1:
                    System.out.println("\n--- Cadastro de Usuário ---");
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("CPF: ");
                    String cpf = input.nextLine();
                    System.out.print("E-mail: ");
                    String email = input.nextLine();
                    System.out.print("Tipo (Aluno/Professor): ");
                    String tipoOpcao = input.nextLine().trim();

                    if (usuarios.containsKey(cpf)) {
                        System.out.println("Usuário já cadastrado.");
                    } else if (tipoOpcao.equalsIgnoreCase("Aluno")) {
                        System.out.print("Matrícula: ");
                        String matricula = input.nextLine();
                        System.out.print("Curso: ");
                        String curso = input.nextLine();
                        System.out.print("Semestre: ");
                        int semestre = Integer.parseInt(input.nextLine().trim());
                        usuarios.put(cpf, new Aluno(nome, matricula, cpf, email, curso, semestre));
                        System.out.println("Aluno cadastrado com sucesso.");
                    } else if (tipoOpcao.equalsIgnoreCase("Professor")) {
                        System.out.print("Registro: ");
                        String registro = input.nextLine();
                        System.out.print("Departamento: ");
                        String departamento = input.nextLine();
                        System.out.print("Titulação: ");
                        String titulacao = input.nextLine();
                        usuarios.put(cpf, new Professor(nome, registro, cpf, email, departamento, titulacao));
                        System.out.println("Professor cadastrado com sucesso.");
                    } else {
                        System.out.println("Tipo inválido. Digite Aluno ou Professor.");
                    }
                    break;

                // CADASTRO DE LIVRO
                case 2:
                    System.out.println("\n--- Cadastro de Livro ---");
                    System.out.print("Título: ");
                    String titulo = input.nextLine();
                    System.out.print("Autor: ");
                    String autor = input.nextLine();
                    System.out.print("Editora: ");
                    String editora = input.nextLine();
                    System.out.print("ISBN: ");
                    int isbn = input.nextInt();
                    System.out.print("Ano: ");
                    int ano = input.nextInt();
                    input.nextLine();

                    if (livros.containsKey(isbn)) {
                        System.out.println("Livro com este ISBN já cadastrado.");
                    } else {
                        livros.put(isbn, new Livro(titulo, autor, editora, isbn, ano, true));
                        System.out.println("Livro cadastrado com sucesso.");
                    }
                    break;

                // REALIZAR EMPRÉSTIMO
                case 3:
                    System.out.println("\n--- Realizar Empréstimo ---");
                    System.out.print("CPF do usuário: ");
                    String cpfEmp = input.nextLine();
                    Usuario usuario = usuarios.get(cpfEmp);

                    if (usuario == null) {
                        System.out.println("Usuário não encontrado. Cadastre o usuário primeiro.");
                        break;
                    }

                    System.out.print("ISBN do livro: ");
                    int isbnEmp = input.nextInt();
                    Livro livro = livros.get(isbnEmp);

                    if (livro == null) {
                        System.out.println("Livro não encontrado. Cadastre o livro primeiro.");
                        input.nextLine();
                        break;
                    }

                    System.out.print("Data do empréstimo (dd/mm/aaaa): ");
                    input.nextLine();
                    String data = input.nextLine();

                    Emprestimo emp = new Emprestimo(contadorEmprestimo, usuario, livro, data);
                    emprestimos.put(contadorEmprestimo, emp);
                    contadorEmprestimo++;
                    break;

                // DEVOLUÇÃO
                case 4:
                    System.out.println("\n--- Devolução de Livro ---");
                    System.out.print("Número do empréstimo: ");
                    int numDev = input.nextInt();
                    input.nextLine();
                    Emprestimo empDev = emprestimos.get(numDev);

                    if (empDev == null) {
                        System.out.println("Empréstimo não encontrado.");
                    } else {
                        empDev.devolverLivro();
                    }
                    break;

                // CONSULTAR EMPRÉSTIMO
                case 5:
                    System.out.println("\n--- Consulta de Empréstimo ---");
                    System.out.print("Número do empréstimo: ");
                    int numCon = input.nextInt();
                    input.nextLine();
                    Emprestimo empCon = emprestimos.get(numCon);

                    if (empCon == null) {
                        System.out.println("Empréstimo não encontrado.");
                    } else {
                        empCon.exibirInformacoes();
                    }
                    break;

                // LISTAR TODOS OS LIVROS
                case 6:
                    System.out.println("\n--- Acervo da Biblioteca ---");
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        System.out.printf("%-10s %-35s %-20s %-20s %-12s%n",
                                "ISBN", "Título", "Autor", "Editora", "Status");
                        System.out.println("-".repeat(100));
                        for (Livro l : livros.values()) {
                            System.out.printf("%-10d %-35s %-20s %-20s %-12s%n",
                                    l.getIsbn(),
                                    l.getTitulo(),
                                    l.getAutor(),
                                    l.getEditora(),
                                    l.isDisponivel() ? "Disponível" : "Emprestado");
                        }
                    }
                    break;

                // CONSULTAR DISPONIBILIDADE
                case 7:
                    System.out.println("\n--- Consulta de Disponibilidade ---");
                    System.out.print("ISBN do livro: ");
                    int isbnConsulta = input.nextInt();
                    input.nextLine();
                    Livro livroConsulta = livros.get(isbnConsulta);

                    if (livroConsulta == null) {
                        System.out.println("Livro não encontrado.");
                    } else {
                        System.out.println("Livro: " + livroConsulta.getTitulo());
                        System.out.println("Status: " + (livroConsulta.isDisponivel() ? "Disponível" : "Emprestado"));
                    }
                    break;

                // ── EXIBIR DADOS DE USUÁRIO
                case 8:
                    System.out.println("\n--- Dados do Usuário ---");
                    System.out.print("CPF do usuário: ");
                    String cpfBusca = input.nextLine();
                    Usuario usuarioBusca = usuarios.get(cpfBusca);

                    if (usuarioBusca == null) {
                        System.out.println("Usuário não encontrado.");
                    } else {
                        usuarioBusca.exibirInformacoes();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        input.close();
    }
}