package Aula14.Robo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramacaoDeRobo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Acao> programa = new ArrayList<>();

        int op = 0;

        while(op != 4) {
            System.out.println("\n--- Programador de Robô ---");
            System.out.println("1 - Adicionar Acão: Andar");
            System.out.println("2 - Adicionar Acão: Girar");
            System.out.println("3 - Ver programa");
            System.out.println("4 - Executar Programa e Sair");
            op = sc.nextInt();

            if(op == 1) programa.add(new Andar(10));
            if(op == 2) programa.add(new Girar("direita"));
            if(op == 3) System.out.println("Programa tem " + programa.size() + " ações.");
        }

        System.out.println("\n--- EXECUTANDO PROGRAMA ROBÔ ---");
        for(Acao acao : programa) {
            acao.executar();
        }
        System.out.println("--- FIM DA EXECUÇÃO ---");
        sc.close();
    }
}
