package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoProtectedEnClaseAbstracta;

public class Triangulo extends Figura {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // Implementación simplificada para un triángulo rectángulo
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}