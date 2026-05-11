package Aula11.Banco;
/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Raíssa", "111.222.333-44");
        Conta conta1 = new ContaCorrente(cliente1);
        conta1.depositar(3500.0);

        Cliente cliente2 = new Cliente("Ana Clara", "222.333.444.-55");
        Conta conta2 = new ContaPoupanca(cliente2);
        conta2.depositar(2743.0);

        Conta[] contasDoBanco = {conta1, conta2};
        Conta contaAtiva = contasDoBanco[0];

        int opt = 0;

        while(opt != 8) {
            System.out.println("\n=== Caixa Eletrônico ===");
            System.out.println("Bem-Vindo(a), " + contaAtiva.getNomeTitular() + " | Conta: " + contaAtiva.getClass().getSimpleName());
            System.out.println("[1]. Consultar saldo");
            System.out.println("[2]. Depositar");
            System.out.println("[3]. Sacar");
            System.out.println("[4]. Transferir");
            System.out.println("[5]. Trocar de conta (login)");

            if(contaAtiva instanceof ContaCorrente) {
                System.out.println("[6]. Cobrar taxa de Manutenção");
            }
            if(contaAtiva instanceof ContaPoupanca) {
                System.out.println("[7]. Fazer render juros");
            }

            System.out.println("[8]. Sair");
            System.out.println("Escolha uma opção: ");

            try{
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        contaAtiva.exibirDados();
                        break;

                    case 2:
                        System.out.println("Digite o valor que deseja depositar: ");
                        contaAtiva.depositar(sc.nextDouble());
                        break;

                    case 3:
                        System.out.println("Digite o valor para sacar:");
                        contaAtiva.sacar(sc.nextDouble());
                        break;

                    case 4:
                        System.out.println("Digite o número da conta destino: ");
                        int numContaDest = sc.nextInt();
                        Conta contaDest = null;

                        for(Conta c : contasDoBanco) if(c.getNumero() == numContaDest) contaDest = c;

                        if(contaDest != null && contaDest != contaAtiva) {
                            System.out.println("Digite o valor para transferir: ");
                            contaAtiva.transferir(contaDest, sc.nextDouble());
                        } else {
                            System.out.println("Conta destino inválida ou igual à origem");
                        }
                        break;

                    case 5:
                        System.out.println("\n === CONTAS DISPONÍVEIS  ===");

                        for(Conta c : contasDoBanco) {
                            System.out.println("N' " + c.getNumero() + " - " + c.getClass().getSimpleName() + " - " + c.getNomeTitular());
                        }
                        System.out.println("Digite o número da conta desejada: ");
                        int numContaLogin = sc.nextInt();
                        boolean ec = false;

                        for(Conta c : contasDoBanco) {
                            if(c.getNumero() == numContaLogin) {
                                contaAtiva = c;
                                ec = true;
                                break;
                            }
                        }

                        if(ec) System.out.println("login efetuado com sucesso!");
                        else System.out.println("Conta não encontrada!");
                        break;

                    case 6:
                        if(contaAtiva instanceof ContaCorrente) {
                            ((ContaCorrente) contaAtiva).cobrarTaxa();
                        } else{
                            System.out.println("Opção válida apenas para Contas Correntes.");
                        }
                        break;

                    case 7:
                        if(contaAtiva instanceof ContaPoupanca) {
                            ((ContaPoupanca) contaAtiva).renderJuros();
                        } else{
                            System.out.println("Opção válida apenas para Conta Poupança");
                        }
                        break;

                    case 8:
                        System.out.println("Obrigado pela preferência. Volte Sempre!");
                        break;

                    default:
                        System.out.println("Opção Inválida :|");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, Digite apenas números!");
                sc.next();
            }
        }
        sc.close();
    }
}
 */
