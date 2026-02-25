package ac33;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    private Map<Integer, Ubicacion> mundo = new HashMap<>();

    public main() {

        mundo.put(0, new Ubicacion(0, "Has salido de la aventura"));
        mundo.put(1, new Ubicacion(1, "Estas en la cima de una montaña"));
        mundo.put(2, new Ubicacion(2, "Estas en una isla perdida"));
        mundo.put(3, new Ubicacion(3, "Estas en una biblioteca secreta"));
        mundo.put(4, new Ubicacion(4, "Estas en un volcan inactivo"));
        mundo.put(5, new Ubicacion(5, "Estas en un desierto infinito"));

        mundo.get(1).addExit("N", 2);
        mundo.get(1).addExit("E", 3);
        mundo.get(1).addExit("Q", 0);

        mundo.get(2).addExit("S", 1);
        mundo.get(2).addExit("E", 4);
        mundo.get(2).addExit("Q", 0);

        mundo.get(3).addExit("O", 1);
        mundo.get(3).addExit("S", 5);
        mundo.get(3).addExit("Q", 0);

        mundo.get(4).addExit("O", 2);
        mundo.get(4).addExit("S", 5);
        mundo.get(4).addExit("Q", 0);

        mundo.get(5).addExit("N", 3);
        mundo.get(5).addExit("E", 4);
        mundo.get(5).addExit("Q", 0);
    }

    public static void main(String[] args) {

        main juego = new main();
        Scanner sc = new Scanner(System.in);

        int posicion = 1;

        while (true) {

            Ubicacion lugar = juego.mundo.get(posicion);
            System.out.println(lugar.getDescripcion());

            if (posicion == 0) {
                break;
            }

            System.out.print("Salidas disponibles: ");
            for (String d : lugar.getExits().keySet()) {
                System.out.print(d + " ");
            }

            System.out.println();
            System.out.print("Introduce direccion: ");

            String opcion = sc.nextLine().toUpperCase();

            if (lugar.getExits().containsKey(opcion)) {
                posicion = lugar.getExits().get(opcion);
            } else {
                System.out.println("No puedes ir en esa direccion");
            }
        }

        sc.close();
    }
}
