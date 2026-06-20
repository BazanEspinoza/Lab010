public class Expreso implements Bebida {
    @Override
    public String descripcion() {
        return "Expreso";
    }

    @Override
    public double precio() {
        return 1.99;
    }
}
