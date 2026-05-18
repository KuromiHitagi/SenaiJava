package Aula14.Upload;

public class UploadLocal implements Armazenavel{
    @Override
    public void salvar(String nomeArquivo) {
        System.out.println("Arquivo: " + nomeArquivo + " Salvo localmente com sucesso!");
    }
}
