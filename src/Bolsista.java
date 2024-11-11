public class Bolsista extends Aluno {

    public Bolsista(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public String pagarMensalidade() {
        return "Aluno bolsista paga com desconto";
    }
}
