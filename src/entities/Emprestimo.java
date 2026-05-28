package entities;

public class Emprestimo {

    private int numeroEmprestimo;
    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private String status;

    // mantemos o encapsulamento e utilizamos objetos das classes como parametros na realizacao do emprestimo
    public Emprestimo(int numeroEmprestimo, Usuario usuario, Livro livro, String dataEmprestimo) {

        // retorna disponibilidade do livro dentro do metodo construtor
        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível para empréstimo.");
            return;
        }

        this.numeroEmprestimo = numeroEmprestimo;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        // define o status antes para que nao enchamos o codigo de ifs inuteis
        this.status = "Ativo";

        livro.emprestarLivro();
    }

    public int getNumeroEmprestimo() {
        return numeroEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getStatus() {
        return status;
    }

    // principal metodo utilizado no emprestimo
    public void devolverLivro() {
        // utiliza-se equals em checagem de Strings
        if (status.equals("Ativo")) {
            status = "Devolvido";
            livro.devolverLivro();
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Este empréstimo já foi realizado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Número do empréstimo: " + numeroEmprestimo);
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Data: " + dataEmprestimo);
        System.out.println("Status: " + status);
    }
}