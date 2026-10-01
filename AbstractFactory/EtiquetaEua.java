public class EtiquetaEua implements Etiqueta {

    @Override
    public String gerarEtiqueta(Pedido pedido) {
        // ZIP+4: 902101234 -> 90210-1234
        String zip = pedido.getCodigoPostal().replaceAll("[^0-9]", "");
        String zipFormatado = zip.substring(0, 5) + "-" + zip.substring(5);

        return "USPS | ZIP+4: " + zipFormatado;
    }
}