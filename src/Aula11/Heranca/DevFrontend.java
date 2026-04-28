package Aula11.Heranca;

public class DevFrontend extends Funcionario{
    private String linguagem;

    public DevFrontend(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void programar() {
        System.out.println("O dev: " + this.nome
                + " está codando em: " + this.linguagem);
    }
}
