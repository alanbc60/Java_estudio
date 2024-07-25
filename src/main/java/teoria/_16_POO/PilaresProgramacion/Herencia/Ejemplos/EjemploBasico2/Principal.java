package teoria._16_POO.PilaresProgramacion.Herencia.Ejemplos.EjemploBasico2;

public class Principal {
    public static void main(String[] args) {
        Alumno alum = new Alumno("Alan","Bastida", 26, "alanbc60@gmail.com", "UAM", 10, 10, 10);
        alum.setNombre("Alan");
        alum.setEdad(26);
        alum.setInstitucion("UAM");


        // Si queremos usar la clase padre seria asi:

        Persona alumno = new Alumno("Alan","Bastida", 26, "alanbc60@gmail.com", "UAM", 10, 10, 10);

        // debemos de encerrar entre parentesis el metodo que tiene en la clase alumno

        ((Alumno)alumno).setApellido("Bastida");

    }
}
