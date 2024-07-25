package teoria._15_ApiColeccion.Lists.ListaLigadas;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ListaLigadaEjemplo1 {
    Node head;

    // Insertar un nuevo nodo al principio
    public void insertarInicio(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertar un nuevo nodo al final
    public void insertarFinal(int data) {
        // si la lista esta vacia
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Eliminar un nodo con un valor específico
    public void borrarNodo(int key) {
        Node temp = head;
        Node prev = null;

        // Si la cabeza contiene el valor a eliminar
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Buscar el nodo a eliminar
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // Si el valor no está presente en la lista
        if (temp == null) return;

        // Desenlazar el nodo
        prev.next = temp.next;
    }

    // Recorrer la lista y mostrar sus elementos
    public void imprimirLista() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListaLigadaEjemplo1 list = new ListaLigadaEjemplo1();
        list.insertarInicio(1);
        list.insertarInicio(2);
        list.insertarFinal(3);
        list.insertarFinal(4);

        System.out.println("Lista enlazada:");
        list.imprimirLista();

        list.borrarNodo(3);
        System.out.println("\nLista enlazada después de eliminar el nodo con valor 3:");
        list.imprimirLista();
    }
}
