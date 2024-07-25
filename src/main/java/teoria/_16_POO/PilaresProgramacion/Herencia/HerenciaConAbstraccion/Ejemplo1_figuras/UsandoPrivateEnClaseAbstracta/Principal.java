package teoria._16_POO.PilaresProgramacion.Herencia.HerenciaConAbstraccion.Ejemplo1_figuras.UsandoPrivateEnClaseAbstracta;

public class Principal {
    public static void main(String[] args) {

        // Crear instancias de las clases hijas
        Figura cuadrado = new Cuadrado(6, 6);
        Cuadrado cuadrado2 = new Cuadrado(6, 6);
        Figura triangulo = new Triangulo(3, 4);

        // En cuadrado no se puede acceder a los metodos propios de la clase Cuadrado
        // cuadrado.setColor("Rojo");


        // En cuadrado2 se puede acceder a los metodos propios de la clase Cuadrado
        cuadrado2.setColor("Verde");


        // la diferencia entre cuadrado y cuadrado2 es que cuadrado2 es una instancia de la clase Cuadrado
        // y cuadrado es una instancia de la clase Figura
        //* eso significa que que cuadrado2 usa los metodos propios de la clase Cuadrado */

        // Usar los métodos de las clases hijas
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println(cuadrado.toString());


        System.out.println("Área del cuadrado: " + cuadrado2.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado2.calcularPerimetro());

        System.out.println(cuadrado2.toString());


        System.out.println("Área del cuadrado 2: " + cuadrado2.calcularArea());
        System.out.println("Perímetro del cuadrado 2: " + cuadrado2.calcularPerimetro());

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        // Mostrar información de las figuras
        cuadrado.mostrarInfo();
        triangulo.mostrarInfo();

    }
}
