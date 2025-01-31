class ProcessadorCSV extends ArquivoProcessador {
    @Override
    protected void lerDados() {
        System.out.println("Lendo dados do arquivo CSV...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando dados do arquivo CSV...");
    }

    @Override
    protected void salvarArquivo() {
        System.out.println("Salvando arquivo CSV...");
    }
}
