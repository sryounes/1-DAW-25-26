package ac4;

public class forma {
    protected String nombre;

    public forma(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

