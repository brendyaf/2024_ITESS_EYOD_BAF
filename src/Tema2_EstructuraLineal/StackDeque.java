
package Tema2_EstructuraLineal;

import java.util.Deque;
import java.util.LinkedList;


public class StackDeque<E> implements Stacks<E> {
    private Deque<E> deque;

    public StackDeque() {
        this.deque = new LinkedList<>();  // Usa LinkedList como Deque
    }

    @Override
    public void push(E element) {
        deque.addFirst(element);  // Almacena en el inicio para simular una pila
    }

    @Override
    public E pop() {
        return deque.removeFirst();  // Quita del inicio como `pop` de pila
    }

    @Override
    public E peek() {
        return deque.peekFirst();  // Muestra el primer elemento sin quitarlo
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public int size() {
        return deque.size();
    }
}
