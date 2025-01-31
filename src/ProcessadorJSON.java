class ProcessadorJSON extends ArquivoProcessador {
    @Override
    protected void lerDados() {
        System.out.println("Lendo dados do arquivo JSON...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando dados do arquivo JSON...");
    }

    @Override
    protected void salvarArquivo() {
        System.out.println("Salvando arquivo JSON...");
    }
}
