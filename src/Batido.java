public class Batido implements Bebida {
    @Override
    public String descripcion() {
        return "Batido";
    }

    @Override
    public double precio() {
        return 0.89;
    }
}
