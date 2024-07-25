package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoPrivateEnClaseAbstracta;

public class Triangulo extends Figura {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return 0.5 * getBase() * getAltura();
    }

    @Override
    public double calcularPerimetro() {
        // Implementación simplificada para un triángulo rectángulo
        return getBase() + getAltura() + Math.sqrt(getBase() * getBase() + getAltura() * getAltura());
    }

    @Override
    public String toString() {  
        return "Triangulo [base=" + getBase() + ", altura=" + getAltura() + "]";
    }
}