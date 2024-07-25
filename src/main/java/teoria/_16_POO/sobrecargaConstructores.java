package teoria._16_POO;

// Simulando que es una clase persona
public class sobrecargaConstructores {
    
    private String nombre;
    private String apellido;
    private int edad;

    sobrecargaConstructores(String nombre, String apellido, int edad){
        this.apellido = apellido;
        this.nombre = nombre; 
        this.edad = edad;
    }

    sobrecargaConstructores(String nombre, String apellido){
        this.apellido = apellido;
        this.nombre = nombre; 
    }

    // constructor vacio
    sobrecargaConstructores(){}

    sobrecargaConstructores(String nombre){
        this.nombre = nombre;
    }


    public static void main(String[] args) {
        sobrecargaConstructores scc = new sobrecargaConstructores();
        sobrecargaConstructores scc1 = new sobrecargaConstructores("Alan", "Bastida", 26);
        sobrecargaConstructores scc2 = new sobrecargaConstructores("Alan", "Bastida");
        
    }

    
}
