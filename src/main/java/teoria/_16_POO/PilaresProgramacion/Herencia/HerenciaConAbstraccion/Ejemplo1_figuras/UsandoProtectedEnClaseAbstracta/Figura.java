package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoProtectedEnClaseAbstracta;

public abstract class Figura {

    // Usar atributos en la clas abstracta es conveniente para las clases que hereden de esta y estas clases hijas tienen en este caso
    // tienen base y altura

    // Si usamos protected si quieres que los atributos sean accesibles desde las subclases,
    protected double base;
    protected double altura;

    // el constructor lo usaran las clases que hereden de esta
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // para que una clase sea abstracta debe tener minimo un método abstracto
    public abstract double calcularPerimetro();
    public abstract double calcularArea();


}
