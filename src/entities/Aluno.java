package entities;

public class Aluno extends Usuario {

    private String curso;
    private int semestre;

    public Aluno(String nome, String matricula, String cpf, String email, String curso, int semestre) {
        super(nome, matricula, cpf, email, "Aluno");
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
        System.out.println("Semestre: " + semestre);
    }
}