package teoria._15_ApiColeccion.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class ColaInterfaz {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Añadir elementos al final de la cola
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Mostrar el primer elemento del queue
        System.out.println("Front element is: " + queue.peek());

        // Remover elementos del queue
        System.out.println("Dequeued element is: " + queue.poll());
        System.out.println("Front element after dequeue is: " + queue.peek());

        // Verificar si el queue está vacío
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}