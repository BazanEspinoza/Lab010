public class ConLeche extends DecoradorBebida {

    public ConLeche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + ", Leche";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.10;
    }
}
