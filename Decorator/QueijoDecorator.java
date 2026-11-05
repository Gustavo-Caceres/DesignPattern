//Decorador concreto
public class QueijoDecorator extends AdicionalDecorator {
    public QueijoDecorator(iLanche lanche) {
        super(lanche);
    }

    @Override
    public String Descricao() {
        return lanche.Descricao() + ", queijo";
    }

    @Override
    public double Preco() {
        return lanche.Preco() + 3.0;
    }
}
