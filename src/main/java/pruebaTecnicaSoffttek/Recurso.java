package pruebaTecnicaSoffttek;

public abstract class Recurso {
    private String nombre;
    private String fechaDeCreacion;
    private String creador;

    Recurso(String nombre, String fechaDeCreacion, String creador){
        this.nombre = nombre;
        this.fechaDeCreacion = fechaDeCreacion;
        this.creador = creador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {    
        this.creador = creador; 
    }

    // int duracionCanciones(String nombre);
    // String plataforma(String nombre);
    
    public abstract String mostrarDetalles();

}

