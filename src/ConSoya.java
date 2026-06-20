public class ConSoya extends DecoradorBebida {

    public ConSoya(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + ", Soya";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.15;
    }
}
