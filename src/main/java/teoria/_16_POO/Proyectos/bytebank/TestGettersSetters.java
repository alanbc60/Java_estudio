package teoria._16_POO.Proyectos.bytebank;

public class TestGettersSetters {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.setNumero(1337);
        System.out.println(cuenta.getNumero());

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Diego Rojas");

        // la clase cuenta ahora esta asociada a una clase cliente
        cuenta.setTitular(cliente1);
        System.out.println(cuenta.getTitular().getNombre());

        cuenta.getTitular().setTelefono("9944332211");
        //ahora en dos lineas
        Cliente titular = cuenta.getTitular();
        titular.setTelefono("9944332211");

        System.out.println(titular);
        System.out.println(cliente1);
        System.out.println(cuenta.getTitular());

    }

}
