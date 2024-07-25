package teoria._15_ApiColeccion.Stack;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ListaLigadaPila {
    private Node top;

    // Añadir un elemento al tope de la pila
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Remover y retornar el elemento del tope de la pila
    public int pop() {
        if (top == null) {
            throw new IllegalStateException("La pila esta vacia");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Retornar el elemento del tope de la pila sin removerlo
    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        ListaLigadaPila stack = new ListaLigadaPila();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element after pop is: " + stack.peek());
    }
}
