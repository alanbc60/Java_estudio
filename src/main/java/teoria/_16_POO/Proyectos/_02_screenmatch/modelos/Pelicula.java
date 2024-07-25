package teoria._16_POO.Proyectos._02_screenmatch.modelos;

import _14_POO.Proyectos._02_screenmatch.Calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // calculaMedia() es metodo de la clase pelicula
    @Override
    public int getClasificacion() {
        return (int) super.calculaMedia() / 2;
    }
}