package sistemaEscolar;

public class Main {

    public static void main(String[] args) {

        double[] notas = {8.0, 7.5, 9.0};

        Aluno aluno = new Aluno("Rhudsonn", notas);

        Professor professor = new Professor(
                "Rhud",
                "Matemática",
                "Sala 6",
                60
        );

        Boletim boletim = new Boletim(aluno, professor);

        boletim.imprimirBoletim();
    }
}