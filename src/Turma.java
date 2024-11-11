import java.util.ArrayList;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    public void listarAlunos() {
        alunos.forEach((aluno) -> System.out.println(aluno));
    }
}
