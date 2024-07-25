package teoria._16_POO.Interface.Ejemplos.Ejemplo3-Imprenta.model;

public abstract class Hoja {
    private String contenido;


    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public Hoja(){};

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    

    public abstract String imprimir();

}
