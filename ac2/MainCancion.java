package ac2;

import java.util.*;

public class MainCancion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Album> albums = new ArrayList<>();

        Album album1 = new Album("Album1", "Cantante1");
        album1.addSong("cancion 1", 1.1);
        album1.addSong("cancion 2", 1.2);
        album1.addSong("cancion 3", 1.3);

        Album album2 = new Album("Album 2", "Cantante 2");
        album2.addSong("cancion 2.1", 2.1);
        album2.addSong("cancion 2.2", 2.2);
        album2.addSong("cancion 2.3", 2.3);

        LinkedList<Cancion> playList = new LinkedList<>();

        album1.addToPlayList("Cancion 3", playList);
        album2.addToPlayList("cancion 4", playList);

        album1.addToPlayList(2, playList);
        album2.addToPlayList(3, playList);

        play(playList);
    }
    public static void Menu(){
        System.out.println("--MENU--");
        System.out.println("0. Salir");
        System.out.println("1. Siguiente cancion");
        System.out.println("2. Ultima cancion");
        System.out.println("3. Repetir cancion");
        System.out.println("4. Imprimir Lista");
        System.out.println("5. Imprimir menu");
        System.out.println("6. Eliminar cancion");
    }

    public static void printList(LinkedList<Cancion> playList) {
        Iterator<Cancion> iterator = playList.iterator();
        System.out.println("Lista de reproducción:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------");
    }

    public static void play(LinkedList<Cancion> playList) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Cancion> listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("La playlist esta vacia.");
            return;
        } else {
            System.out.println("Reproduciendo: " + listIterator.next());
        }

        Menu();

        while (!quit) {

            System.out.print("Elige una opción: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {

                case 0:
                    System.out.println("Saliendo de la playlist...");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Reproduciendo: " + listIterator.next());
                    } else {
                        System.out.println("Has llegado al final de la playlist.");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Reproduciendo: " + listIterator.previous());
                    } else {
                        System.out.println("Estas al inicio de la playlist.");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Reproduciendo: " + listIterator.previous());
                            forward = false;
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Reproduciendo: " + listIterator.next());
                            forward = true;
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    Menu();
                    break;

                case 6:
                    if (playList.size() > 0) {

                        listIterator.remove();

                        if (listIterator.hasNext()) {
                            System.out.println("Ahora suena: " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Ahora suena: " + listIterator.previous());
                        } else {
                            System.out.println("La playlist está ahora vacía.");
                        }

                    } else {
                        System.out.println("No hay canciones para eliminar.");
                    }
                    break;
            }
        }
    }
}
