package teoria._16_POO.PilaresProgramacion.Herencia.Ejemplos.EjemploBasico2;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaCiencias;
    private double notaHistoria;

    // heredar el constructor de la clase padre
    Alumno(String nombre, String apellido, int edad, String email, String institucion, double notaMatematica, double notaCiencias, double notaHistoria) {
        super(nombre, apellido, edad, email);
        this.institucion = institucion;
        this.notaMatematica = notaMatematica;
        this.notaCiencias = notaCiencias;
        this.notaHistoria = notaHistoria;
        System.out.println("Invocando el ");    
    }


    public String getInstitucion() {
        return institucion;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

}
