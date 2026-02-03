package ac4;

public class MainPintura {
    public static void main(String[] args) {

        Pintura pintura = new Pintura(250);

        forma rectangulo = new Rectangulo(20, 35);
        forma esfera = new Esfera(15);
        forma cilindro = new Cilindro(10, 30);

        System.out.println("Pintura en " + rectangulo + ": "
                + pintura.cantidadPintura(rectangulo));

        System.out.println("Pintura en " + esfera + ": "
                + pintura.cantidadPintura(esfera));

        System.out.println("Pintura en " + cilindro + ": "
                + pintura.cantidadPintura(cilindro));
    }
}

