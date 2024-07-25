package pruebaTecnicaSoffttek;

public class Principal {

    public static void main(String[] args) {    
        Videojuego v1 =  new Videojuego("Halo", "11 mayo 2014", "Microsoft", true, "xbox");
        // v1.setPlataforma("xbox");
        // v1.setjuegoDelAnio(true);
        v1.mostrarDetalles();
    }
}
