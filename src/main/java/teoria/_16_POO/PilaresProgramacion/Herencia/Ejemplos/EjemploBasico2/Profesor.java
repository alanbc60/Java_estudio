package teoria._16_POO.PilaresProgramacion.Herencia.Ejemplos.EjemploBasico2;

public class Profesor extends Persona{
    private String asignatura;

    Profesor(String nombre, String apellido, int edad, String email){
        super(nombre, apellido, edad, email);
        System.out.println("Invocando el ");    
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}
