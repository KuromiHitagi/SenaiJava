package Aula11.Heranca;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void aprovarVerba() {
        System.out.println("O gerente: " + this.nome
                + " do departamento: " + this.departamento
                + ", aprovou a verba.");
    }
}
