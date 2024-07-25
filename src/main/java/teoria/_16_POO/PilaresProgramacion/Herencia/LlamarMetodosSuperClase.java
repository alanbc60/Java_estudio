package teoria._16_POO.PilaresProgramacion.Herencia;


class SuperClase {
    public void metodoSuperClase() {
        System.out.println("Método de la superclase");
    }
}

class SubClase extends SuperClase {
    @Override

    public void metodoSuperClase() {
        super.metodoSuperClase(); // Llama al método de la superclase
        System.out.println("Método de la subclase");
    }
}

public class LlamarMetodosSuperClase {
    public static void main(String[] args) {
        SubClase subClase = new SubClase();
        subClase.metodoSuperClase(); // Llama al método sobrescrito en la subclase
    }
}