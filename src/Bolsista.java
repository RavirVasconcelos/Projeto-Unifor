public class Bolsista extends Aluno {

    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public String pagarMensalidade() {
        return "Aluno bolsista paga com desconto";
    }
    @Override
    public String toString() {
        return  '\n' +
                "Aluno Bolsista: " + getNome() +
                ", CPF: " + getCpf() +
                ", Idade: " +getIdade() +
                ", Matricula: " + getMatricula();
    }
}
