public class Regular extends Aluno {

    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public String pagarMensalidade() {
        return "Aluno regular paga o valor integral";
    }
    @Override
    public String toString() {
        return  '\n' +
                "Aluno Regular: " + getNome() +
                ", CPF: " + getCpf() +
                ", Idade: " +getIdade() +
                ", Matricula: " + getMatricula();
    }
}
