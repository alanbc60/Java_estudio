package teoria._06_usoDeString;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual); // False
        
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);


        //curso3 se creó usando una cadena literal, al igual que curso. En Java, las cadenas literales
        //que tienen el mismo contenido se almacenan en un área de memoria común llamada "pool de cadenas".
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
