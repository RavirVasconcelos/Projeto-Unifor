public class Regular extends Aluno {

    public Regular(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public String pagarMensalidade() {
        return "Aluno regular paga o valor integral";
    }
}
