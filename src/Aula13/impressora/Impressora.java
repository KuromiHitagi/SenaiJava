package Aula13.impressora;

public class Impressora {
    public static void main(String[] args) {
        Documento[] filaDeImpressao = {
                new Relatorio("Vendas_Setembro.pdf"),
                new Foto("ferias_no_zoo.png"),
                new Relatorio("Balancete-Anual.docx")
        };

        System.out.println("--- Inicializando fila de impressão ---");

        // O POLIMORFISMO ocorre aqui, o próprio método de cada classe filha, se encarrega de executar da maneira correta.
        for(Documento doc : filaDeImpressao) {
            doc.imprimir();
        }
    }
}
