package Aula14.Upload;

public class UploadNuvem implements Armazenavel{
    @Override
    public void salvar(String nomeArquivo) {
        System.out.println("Enviando o arquivo: " + nomeArquivo);
        System.out.println("Upload na nuvem realizado!");
    }
}
