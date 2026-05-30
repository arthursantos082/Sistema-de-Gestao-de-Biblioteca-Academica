package entities;

public class Professor extends Usuario {

    private String registro;
    private String departamento;
    private String titulacao;

    public Professor(String nome, String registro, String cpf, String email, String departamento, String titulacao) {
        super(nome, registro, cpf, email, "Professor");
        this.registro = registro;
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    // professor nao realiza matricula, possui um registro
    public String getRegistro() {
        return registro;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
        System.out.println("Titulação: " + titulacao);
    }
}