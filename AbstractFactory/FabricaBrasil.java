public class FabricaBrasil implements FabricaPais{
    @Override
    public Documento criarDocumento(){
        return new DocumentoBrasil();
    }

    @Override
    public Pagamento criarPagamento(){
        return new PagamentoBrasil();
    }

    @Override
    public Etiqueta criarEtiqueta(){
        return new EtiquetaBrasil();
    }

}