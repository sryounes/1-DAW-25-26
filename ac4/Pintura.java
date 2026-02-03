package ac4;

public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double cantidadPintura(forma forma) {
        return forma.area() / cobertura;
    }
}
