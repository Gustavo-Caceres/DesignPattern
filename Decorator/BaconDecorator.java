//Decorador concreto
public class BaconDecorator extends AdicionalDecorator {
    public BaconDecorator(iLanche lanche) {
        super(lanche);
    }

    @Override
    public String Descricao() {
        return lanche.Descricao() + ", bacon";
    }

    @Override
    public double Preco() {
        return lanche.Preco() + 5.0;
    }
}
