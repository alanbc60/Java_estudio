package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoPrivateEnClaseAbstracta;

public abstract class Figura {

    // Usar atributos en la clas abstracta es conveniente para las clases que hereden de esta y estas clases hijas tienen en este caso
    // tienen base y altura

    // Si usamos private solo esta accesible en esta clase (encapsulacion) y debemos de usar los metodos publicos (getters y setters)
    private double base;
    private double altura;

    // el constructor lo usaran las clases que hereden de esta
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }

    //*  para que una clase sea abstracta debe tener minimo un método abstracto

    // cuando una clase abstracta tiene un método abstracto, se está facilitando el polimorfismo.
    public abstract double calcularPerimetro();
    public abstract double calcularArea();


    public void mostrarInfo() {
        System.out.println("Esta es una figura con base: " + base + " y altura: " + altura);
    }


}