public abstract class FabricaApolice {
   public abstract absApolice criarApolice();

   public final String processarContratacao() {
    absApolice apolice = criarApolice();          

    if (!apolice.validadeCobertura()) {           
        return "Contratação rejeitada: cobertura não atende aos requisitos.";
    }

    apolice.calculatePremio();                    
    return apolice.gerarResumo();                 
}
}