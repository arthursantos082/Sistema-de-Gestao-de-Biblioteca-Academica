package entities;

public class Usuario {

    private String nome;
    private String matricula;
    private String cpf;
    private String email;
    private String tipo;

    // construtor padrao
    public Usuario(){}

    public Usuario(String nome, String matricula, String cpf, String email, String tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.email = email;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Tipo: " + tipo);
    }
}