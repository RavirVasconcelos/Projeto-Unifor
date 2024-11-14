import java.util.ArrayList;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor, ArrayList<Aluno> alunos) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    public void listarAlunos() {
        alunos.forEach((aluno) -> System.out.println(aluno));
    }

    public void listarTurma() {
        System.out.println("Codigo da turma: " + codigo + '\n' +
                "Disciplina: " + disciplina + '\n' +
                "Professor da turma: " + professor + '\n' +
                "Lista dos alunos: " + alunos);

    }
}
