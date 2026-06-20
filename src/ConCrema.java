public class ConCrema extends DecoradorBebida {

    public ConCrema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + ", Crema";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.10;
    }
}
