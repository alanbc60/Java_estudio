package pruebaTecnicaSoffttek;

public class Videojuego extends Recurso {
    private String nombrePlataforma;
    private boolean juegoDelAnio;

    Videojuego(String nombre, String fechaDeCreacion, String creador, boolean juegoDelAnio, String nombrePlataforma) {
        super(nombre, fechaDeCreacion, creador);
        this.juegoDelAnio = juegoDelAnio;
        this.nombrePlataforma = nombrePlataforma;
    }

    public String getPlataforma() {
        return nombrePlataforma;
    }

    public void setPlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public void setPremioAnio(boolean juegoDelAnio) {
        this.juegoDelAnio = juegoDelAnio;
    }

    public boolean getPremioAnio() {
        return this.juegoDelAnio;
    }

    @Override
    public String mostrarDetalles() {
        return "Nombre del videojuego: " + this.getNombre() +
               ", Fecha de creación: " + this.getFechaDeCreacion() +
               ", Creador: " + this.getCreador() +
               ", Juego del año: " + this.juegoDelAnio +
               ", Plataforma: " + this.nombrePlataforma;
    }
}
