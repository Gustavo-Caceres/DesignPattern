public class main {
    public static void main(String[] args){
            // ===== Testes da Auto =====
        FabricaApolice autoValida   = new FabricaAuto("João Silva", 100000.00, 22, 1, 80000.00);
        FabricaApolice autoInvalida = new FabricaAuto("Maria Souza", 100000.00, 22, 1, 40000.00);

        System.out.println(autoValida.processarContratacao());
        System.out.println(autoInvalida.processarContratacao());

        // ===== Testes da Residencial =====
        FabricaApolice soEscritura = new FabricaRes("Ana Lima", 500000, "Alto Padrão", true, false);
        FabricaApolice soContrato  = new FabricaRes("Pedro Rocha", 300000, "Comum", false, true);
        FabricaApolice nenhum      = new FabricaRes("Carla Dias", 400000, "Comum", false, false);

        System.out.println(soEscritura.processarContratacao());
        System.out.println(soContrato.processarContratacao());
        System.out.println(nenhum.processarContratacao());

        // ===== Testes da Vida =====
        FabricaApolice vidaFumante   = new FabricaVida("Bruno Costa", 40, 200000, true, false);
        FabricaApolice vidaAltaCom   = new FabricaVida("Julia Mendes", 30, 600000, false, true);
        FabricaApolice vidaAltaSem   = new FabricaVida("Rafael Nunes", 30, 600000, false, false);

        System.out.println(vidaFumante.processarContratacao());
        System.out.println(vidaAltaCom.processarContratacao());
        System.out.println(vidaAltaSem.processarContratacao());

        // ===== Testes da Viagem =====
        FabricaApolice nacional     = new FabricaViagem("Lucas Prado", 10, false, 0, false);
        FabricaApolice intCompleta  = new FabricaViagem("Beatriz Alves", 10, true, 50000, true);
        FabricaApolice intSemAssist = new FabricaViagem("Diego Faria", 10, true, 20000, true);
        FabricaApolice intSemPass   = new FabricaViagem("Elisa Moura", 10, true, 50000, false);

        System.out.println(nacional.processarContratacao());
        System.out.println(intCompleta.processarContratacao());
        System.out.println(intSemAssist.processarContratacao());
        System.out.println(intSemPass.processarContratacao());

        Seguradora seguradora = new Seguradora();

        seguradora.registrarFabrica("AUTO",   new FabricaAuto("João Silva", 100000, 22, 1, 80000));
        seguradora.registrarFabrica("RES",    new FabricaRes("Ana Lima", 500000, "Alto Padrão", true, false));
        seguradora.registrarFabrica("VIDA",   new FabricaVida("Bruno Costa", 40, 200000, true, false));
        seguradora.registrarFabrica("VIAGEM", new FabricaViagem("Beatriz Alves", 10, true, 50000, true));

        System.out.println(seguradora.emitirApolice("AUTO"));
        System.out.println(seguradora.emitirApolice("RES"));
        System.out.println(seguradora.emitirApolice("VIDA"));
        System.out.println(seguradora.emitirApolice("VIAGEM"));
        System.out.println(seguradora.emitirApolice("PET"));
                
    }
}
