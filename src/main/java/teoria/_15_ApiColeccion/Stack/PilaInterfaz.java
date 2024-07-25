package teoria._15_ApiColeccion.Stack;

import java.util.Stack;

public class PilaInterfaz {

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // Añadir elementos al stack
            stack.push(1);
            stack.push(2);
            stack.push(3);

            // Mostrar el elemento en el tope del stack
            System.out.println("Top elemento es: " + stack.peek());

            // Remover elementos del stack
            System.out.println("Elemento eliminado es: " + stack.pop());
            System.out.println("Top elemento despues del pop is: " + stack.peek());

            // Verificar si el stack está vacío
            System.out.println("La pila esta vacia? " + stack.isEmpty());
        }

}
