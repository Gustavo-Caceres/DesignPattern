//Decorador concreto
public class OvoDecorator extends AdicionalDecorator {
    public OvoDecorator(iLanche lanche) {
        super(lanche);
    }

    @Override
    public String Descricao() {
        return lanche.Descricao() + ", ovo";
    }

    @Override
    public double Preco() {
        return lanche.Preco() + 2.5;
    }
}
