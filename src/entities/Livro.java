package entities;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int isbn;
    private int ano;
    private boolean disponivel;

    // construtor padrao
    public Livro(){}

    // construtor completo
    public Livro(String titulo, String autor, String editora, int isbn, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    // utilizacao somente de getters -> definicao c/constructors e hash
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getIsbn() {
        return isbn;
    }

    // Redundante, o enunciado nao pede...
    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // estes definem o status do livro que serao utilizados na classe emprestimo
    public void emprestarLivro(){
        this.disponivel = false;
    }

    // por motivos de encapsulamento, alteramos o status diretamente em livro e nao no ato do emprestimo
    public void devolverLivro(){
        this.disponivel = true;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + ano);
        System.out.println("Editora: " + editora);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
