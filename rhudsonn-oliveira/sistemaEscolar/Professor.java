package sistemaEscolar;

public class Professor {

    private String nome;
    private String disciplina;
    private String sala;
    private int cargaHoraria;

    public Professor(String nome, String disciplina, String sala, int cargaHoraria) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.sala = sala;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getSala() {
        return sala;
    }
}