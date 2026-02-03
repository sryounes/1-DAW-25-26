package ac4;

public class MainPintura {
    public static void main(String[] args) {

        Pintura pintura = new Pintura(100);

        forma rectangulo = new Rectangulo(10, 15);
        forma esfera = new Esfera(5);
        forma cilindro = new Cilindro(5, 15);

        System.out.println("Pintura en " + rectangulo + ": "
                + pintura.cantidadPintura(rectangulo));

        System.out.println("Pintura en " + esfera + ": "
                + pintura.cantidadPintura(esfera));

        System.out.println("Pintura en " + cilindro + ": "
                + pintura.cantidadPintura(cilindro));
    }
}

