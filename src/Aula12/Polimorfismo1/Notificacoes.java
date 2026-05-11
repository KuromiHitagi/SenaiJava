package Aula12.Polimorfismo1;

import java.util.Scanner;

class Notificacao {
    public void enviar(String msg) {
        System.out.println("Enviando notificação...");
    }
}

class NotificacaoSMS extends Notificacao{
    @Override
    public void enviar(String msg) {
        System.out.println("\n[SMS] Enviando torpedo...");
        System.out.println("Conteúdo: " + msg);
    }
}

class NotificacaoEmail extends Notificacao{
    @Override
    public void enviar(String msg) {
        System.out.println("\n[E-MAIL] Servidor SMTP conectado...");
        System.out.println("Assunto: Alerta de segurança");
        System.out.println("Corpo: " + msg);
    }
}

class NotificacaoWhatsapp extends Notificacao{
    @Override
    public void enviar(String msg) {
        System.out.println("\n[Whatsapp] Grupo da escola...");
        System.out.println("Mensagem: " + msg);
    }
}

class NotificacaoPush extends Notificacao{
    @Override
    public void enviar(String msg) {
        System.out.println("\n[f] Enviando torpedo...");
        System.out.println("Conteúdo: " + msg);
    }
}

public class Notificacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notificacao canal = null;

        byte op = 1;
        byte[] opt = {1, 2, 3, 4, 0};

        do {
            System.out.println("=======================================");
            System.out.println("    CENTRAL DE SEGURANÇA MULTICANAL    ");
            System.out.println("Como deseja receber o alerta?");
            System.out.println("1 - SMS");
            System.out.println("2 - E-mail");
            System.out.println("3 - Whatsapp");
            System.out.println("4 - push Mobile");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            op = sc.nextByte();

            switch (op) {
                case 1:
                    canal = new NotificacaoSMS();
                    break;

                case 2:
                    canal = new NotificacaoEmail();
                    break;

                case 3:
                    canal = new NotificacaoWhatsapp();
                    break;

                case 4:
                    canal = new NotificacaoPush();
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
                    break;
            }

            if(canal != null) {
                String alerta = "Atenção! Um novo login foi detectado em um navegador desconhecido.";
                canal.enviar(alerta);
            }
            System.out.println("\n=======================================");
        } while (op != 0);
        System.out.println("Sistema finalizado com sucesso!");

        sc.close();
    }
}
