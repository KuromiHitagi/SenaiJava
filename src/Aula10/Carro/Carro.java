package Aula10.Carro;

import java.util.Scanner;

public class Carro {
    private boolean ligar;
    private double velocidade_atual;
    private int marcha;

    public Carro() {
        this.ligar = false;
        this.velocidade_atual = 0.0;
        this.marcha = 0;
    }

    public void ligar(Scanner sc) {
        if(!this.ligar) {
            this.ligar = true;
            System.out.println("Carro ligado com sucesso!");
        } else{
            System.out.println("O carro já está ligado zé!");
        }
        System.out.println("Pressione algo para continuar...");
        sc.nextLine();
    }

    public void acelerar(Scanner sc) {
        if(this.ligar) {
            System.out.println("Digite quanto deseja acelerar: ");
            double velocidade = sc.nextDouble();
            sc.nextLine();

            if(velocidade > 0) {
                this.velocidade_atual += velocidade;
                System.out.println("Velocidade atual: " + this.velocidade_atual);
                marcha();
            } else{
                System.out.println("Velocidade inválida!");
            }
        } else{
            System.out.println("Ligue o carro antes!");
        }

        System.out.println("Pressione algo para continuar...");
        sc.nextLine();
    }

    public void frear(Scanner sc) {
        System.out.println("Digite quanto deseja frear: ");
        double velocidade = sc.nextDouble();
        sc.nextLine();

        if(this.velocidade_atual > 0.0) {
            this.velocidade_atual -= velocidade;

            if(this.velocidade_atual < 0.0) {
                this.velocidade_atual = 0.0;
            }

            System.out.println("Velocidade atual: " + this.velocidade_atual);
            marcha();
        }

        System.out.println("Pressione algo para continuar...");
        sc.nextLine();
    }

    private void marcha() {
        if(this.velocidade_atual == 0.0) {
            this.marcha = 0;
        } else if(this.velocidade_atual <= 20) {
            this.marcha = 1;
        } else if(this.velocidade_atual <= 40) {
            this.marcha = 2;
        } else if(this.velocidade_atual <= 60) {
            this.marcha = 3;
        } else if(this.velocidade_atual <= 80) {
            this.marcha = 4;
        } else if(this.velocidade_atual <= 120) {
            this.marcha = 5;
        } else{
            System.out.println("DESACELERA PELO AMOR DE DEUS MANO!");
        }
    }

    public double getVelocidade() {
        return this.velocidade_atual;
    }

    public boolean desligar(Scanner sc) {
        if(this.velocidade_atual > 0.0) {
            System.out.println("Freie o carro antes de desligar...");
        } else{
            this.ligar = false;
            return false;
        }
        System.out.println("Digite algo para prosseguir...");
        sc.nextLine();
        return true;
    }
}
