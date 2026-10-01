public class FabricaAlemanha implements FabricaPais {

    @Override
    public Documento criarDocumento() {
        return new DocumentoAlemanha();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoAlemanha();
    }

    @Override
    public Etiqueta criarEtiqueta() {
        return new EtiquetaAlemanha();
    }
}