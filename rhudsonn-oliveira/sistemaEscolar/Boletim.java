package sistemaEscolar;

public class Boletim {

    private Aluno aluno;
    private Professor professor;

    public Boletim(Aluno aluno, Professor professor) {
        this.aluno = aluno;
        this.professor = professor;
    }

    public double calcularMedia() {
        double soma = 0;

        for (double n : aluno.getNotas()) {
            soma += n;
        }

        return soma / aluno.getNotas().length;
    }

    public boolean alunoAprovado() {
        return calcularMedia() >= 7;
    }

    public void imprimirBoletim() {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Sala: " + professor.getSala());
        System.out.println("Média: " + calcularMedia());
        System.out.println("Aprovado: " + alunoAprovado());
    }
}