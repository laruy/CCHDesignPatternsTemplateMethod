public class Main {
    public static void main(String[] args) {
        ArquivoProcessador csv = new ProcessadorCSV();
        csv.processarArquivo();

        ArquivoProcessador json = new ProcessadorJSON();
        json.processarArquivo();
    }
}