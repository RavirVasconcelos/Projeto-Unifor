import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina("854796", "Matemática", "1° Semestre");
        Disciplina disciplina2 = new Disciplina("841598", "Química", "3° Semestre");
        Disciplina disciplina3 = new Disciplina("215789", "Física", "5° Semestre");

        Aluno aluno1 = new Regular("021.965.789-15", "Samuel Vasconcelos", 22, "2548796/6");
        Aluno aluno2 = new Regular("281.475.125-85", "Marcelo Cosme", 21, "4785685/9");
        Aluno aluno3 = new Bolsista("859.968.478-35", "Anderson Santana", 25, "2958785/4");

        Professor professor = new Professor("265.857.963-88", "Andre Wescley", 35, "Natureza");

        Visitante visitante1 = new Visitante("587.142.968-55", "Rebeca Lelis", 23);
        Visitante visitante2 = new Visitante("869.329.258-45", "Vitor Lucas", 20);

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        Turma turma1 = new Turma("85479621", disciplina1, professor, alunos);
        Turma turma2 = new Turma("12548796", disciplina2, professor, alunos);
        Turma turma3 = new Turma("25419687", disciplina3, professor, alunos);

        turma1.listarTurma();

        System.out.println();
        turma2.listarTurma();

        System.out.println();
        turma3.listarTurma();
    }
}