abstract class ArquivoProcessador {

    // Método template
    public final void processarArquivo() {
        abrirArquivo();
        lerDados();
        processarDados();
        salvarArquivo();
        fecharArquivo();
    }

    private void abrirArquivo() {
        System.out.println("Abrindo arquivo...");
    }

    protected abstract void lerDados();

    protected abstract void processarDados();

    protected abstract void salvarArquivo();

    private void fecharArquivo() {
        System.out.println("Fechando arquivo...\n");
    }
}
