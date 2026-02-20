package ac2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String nombre;
    private String artista;
    private ArrayList<Cancion> canciones;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    public Cancion findSong(String titulocancion){
        for (Cancion c : canciones){
            if (c.getTitulo().equalsIgnoreCase(titulocancion)){
                return c;
            }
        }
        return null;
    }

    public boolean addSong (String titulocancion, double duracion){

        if (findSong(titulocancion) == null){
            canciones.add(new Cancion(titulocancion, duracion));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String Titulo, LinkedList<Cancion> lista){
        Cancion cancionEncontrada = findSong(Titulo);

        if (cancionEncontrada != null) {
            lista.add(cancionEncontrada);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(int Ncancion, LinkedList<Cancion> Lista){
        int index = Ncancion - 1;


        if (index >= 0 && index < canciones.size()) {
            Lista.add(canciones.get(index));
            return true;
        }

        return false;
    }
}
