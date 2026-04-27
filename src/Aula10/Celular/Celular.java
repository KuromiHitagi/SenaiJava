package Aula10.Celular;

import java.util.Scanner;

public class Celular {
    private int bateria;

    public Celular() {
        this.bateria = 100;
    }

    public void carregar(Scanner sc) {
        System.out.println("Quanto quer carregar?");
        int carga = sc.nextInt();
        sc.nextLine();

        while(carga < 0) {
            carga = sc.nextInt();
            sc.nextLine();
        }

        this.bateria += carga;

        if(this.bateria > 100) this.bateria = 100;
    }

    public void youtube() {
        if(this.bateria > 0) {
            this.bateria -= 30;
            if(this.bateria < 0) this.bateria = 0;
            bateriaAtual();
        } else{
            System.out.println("Bateria insuficiente. Recarregue!");
        }
    }

    public void leve() {
        if(this.bateria > 0) {
            this.bateria -= 20;
            if(this.bateria < 0) this.bateria = 0;
            bateriaAtual();
        } else{
            System.out.println("Bateria insuficiente. Recarregue!");
        }
    }

    public void pesado() {
        if(this.bateria > 0) {
            this.bateria -= 60;
            if(this.bateria < 0) this.bateria = 0;
            bateriaAtual();
        } else{
            System.out.println("Bateria insuficiente. Recarregue!");
        }
    }

    public void musga() {
        if(this.bateria > 0) {
            this.bateria -= 10;
            if(this.bateria < 0) this.bateria = 0;
            bateriaAtual();
        } else{
            System.out.println("Bateria insuficiente. Recarregue!");
        }
    }

    public void bateriaAtual() {
        System.out.println("Carga atual: " + this.bateria + "%");
    }
}
