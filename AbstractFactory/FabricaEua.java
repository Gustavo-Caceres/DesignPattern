public class FabricaEua implements FabricaPais {

    @Override
    public Documento criarDocumento() {
        return new DocumentoEua();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoEua();
    }

    @Override
    public Etiqueta criarEtiqueta() {
        return new EtiquetaEua();
    }
}