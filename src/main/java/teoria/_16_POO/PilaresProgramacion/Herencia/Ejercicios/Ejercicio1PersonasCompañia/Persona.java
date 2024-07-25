package teoria._16_POO.PilaresProgramacion.Herencia.Ejercicios.Ejercicio1PersonasCompañia;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    
    public Persona(String nombre, String apellido, String numeroFiscal, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    @Override
    public String toString() {
        return "numeroFiscal=" + numeroFiscal + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion;
    }


}
