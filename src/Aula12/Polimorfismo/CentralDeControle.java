package Aula12.Polimorfismo;

import java.util.Scanner;

public class CentralDeControle {
    public void apertarPlay(DispositivoDeMidia dispositivo) {
        System.out.println("Conectando ao dispostivo: " + dispositivo.nomeDoDispositivo);
        dispositivo.reproduzir();
        System.out.println("---");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CentralDeControle controle = new CentralDeControle();

        System.out.println("Digite o nome do aparelho e então o nome do filme:  ");
        SmartTV tvDaSala = new SmartTV(sc.nextLine(), sc.nextLine());

        System.out.println("Digite o nome do aparelho e então o nome da música e o artista:  ");
        Celular meuCelular = new Celular(sc.nextLine(), sc.nextLine(), sc.nextLine());

        System.out.println("Digite o nome do aparelho e então o número da a estação (ex: 98,1):  ");
        RadioAutomotivo radioDoCarro = new RadioAutomotivo(sc.nextLine(), sc.nextDouble());
        sc.nextLine();

        controle.apertarPlay(tvDaSala);
        controle.apertarPlay(meuCelular);
        controle.apertarPlay(radioDoCarro);

        System.out.println("Digite enter para confirmar...");
        sc.nextLine();

        System.out.println("\n --- Demonstração com uma lista de dispositivos ---");

        DispositivoDeMidia[] meusDispositivos = {tvDaSala, meuCelular, radioDoCarro};

        for(DispositivoDeMidia dispositivo : meusDispositivos) {
            dispositivo.reproduzir();
        }
    }
}
