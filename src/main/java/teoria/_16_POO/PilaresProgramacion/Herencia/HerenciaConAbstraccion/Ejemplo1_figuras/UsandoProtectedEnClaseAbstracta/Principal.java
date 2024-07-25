package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoProtectedEnClaseAbstracta;

public class Principal {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(10, 10);
        Triangulo triangulo = new Triangulo(10, 10);

        System.out.println(cuadrado.calcularArea());
        System.out.println(triangulo.calcularArea());
    }
}
