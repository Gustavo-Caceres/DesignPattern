//Decorador abstrato
public abstract class AdicionalDecorator implements iLanche {
    protected iLanche lanche;

    public AdicionalDecorator(iLanche lanche) {
        this.lanche = lanche;
    }
}
