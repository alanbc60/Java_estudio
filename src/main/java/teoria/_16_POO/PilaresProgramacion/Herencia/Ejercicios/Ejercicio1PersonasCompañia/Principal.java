package teoria._16_POO.PilaresProgramacion.Herencia.Ejercicios.Ejercicio1PersonasCompañia;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("John", "Roe","12.345.678-9", "Agustinas 2233", 57000.00, 25, 2000.00);
        gerente.aumentarRemuneracion(15);
        gerente.setPresupuesto(77000.00);
        System.out.println(gerente);
    }   
}
