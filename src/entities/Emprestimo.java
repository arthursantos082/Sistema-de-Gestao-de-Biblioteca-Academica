package entities;

public class Emprestimo {

    private int numeroEmprestimo;
    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private String status;

    public Emprestimo(int numeroEmprestimo, Usuario usuario, Livro livro, String dataEmprestimo) {

        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível para empréstimo.");
            return;
        }

        this.numeroEmprestimo = numeroEmprestimo;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.status = "Ativo";

        livro.emprestarLivro();
        System.out.println("Empréstimo nº " + numeroEmprestimo + " realizado com sucesso.");
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

    public void devolverLivro() {
        if (status.equals("Ativo")) {
            status = "Devolvido";
            livro.devolverLivro();
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Este empréstimo já foi encerrado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Número do empréstimo: " + numeroEmprestimo);
        System.out.println("Usuário: " + usuario.getNome() + " | Matrícula: " + usuario.getMatricula());
        System.out.println("Livro: " + livro.getTitulo() + " | ISBN: " + livro.getIsbn());
        System.out.println("Data: " + dataEmprestimo);
        System.out.println("Status: " + status);
    }
}