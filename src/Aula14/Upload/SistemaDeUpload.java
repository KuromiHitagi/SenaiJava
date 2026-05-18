package Aula14.Upload;

import java.util.Scanner;

public class SistemaDeUpload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo para upload: ");
        String Arquivo = sc.nextLine();

        System.out.println("onde você deseja salvar? \n1 - Nuvem. \n2 - Disco Local.");
        int op = sc.nextInt();

        Armazenavel servicoDeUpload = null;
        if(op == 1) {
            servicoDeUpload = new UploadNuvem();
        } else if(op == 2) {
            servicoDeUpload = new UploadLocal();
        } else{
            System.out.println("Você digitou algo de errado.... KABOOM");
        }

        if(servicoDeUpload != null) {
            servicoDeUpload.salvar(Arquivo);
        } else{
            System.out.println("Serviço de Upload inválido!");
        }

        sc.close();
    }
}
