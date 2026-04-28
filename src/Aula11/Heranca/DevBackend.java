package Aula11.Heranca;

public class DevBackend extends Funcionario{
    private String linguagem;

    public DevBackend(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void programar() {
        System.out.println("O dev: " + this.nome
                + " está codando em: " + this.linguagem);
    }
}
