//Componente concreto
public class Hamburguer implements iLanche {
    @Override
    public String Descricao() {
        return "Hambúrguer";
    }

    @Override
    public double Preco() {
        return 20.0;
    }
}
