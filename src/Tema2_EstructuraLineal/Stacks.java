/**
 * @autor Sandra Araceli Hernandez Muñoz
 * programacion de un stack
 * Stack que implementa las funciones FILO y FIFO
 * 17 octubre de 2024
 */
package Tema2_EstructuraLineal;

public interface Stacks<E> {

    /**
     * Regresa el número del stack
     *
     * @return cantidad de elementos/datos
     */
    public int size();

    /**
     * Prueba si el stack está vacío
     *
     * @return true si está vacío, false si no
     */
    public boolean isEmpty();

    /**
     * Agrega un dato en stack.
     */
    public void push(E e);

    /**
     * Elimina un elemento de la pila.
     *
     * @return
     */
    public E pop();

    /**
     * Regresa pero no elimina el elemento superior de la pila.
     *
     * @return
     */
    public E peek();

}
