public class ConMoca extends DecoradorBebida {

    public ConMoca(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + ", Moca";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.20;
    }
}
