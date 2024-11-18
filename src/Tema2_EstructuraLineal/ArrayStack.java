
package Tema2_EstructuraLineal;


public class ArrayStack<E> implements Stack<E> {

    public static final int CAPACITY = 1000; // default array capacity
    private E[] data; // generic array used for storage
    private int t = -1; // index of the top element in stack

    public ArrayStack() {
        this(CAPACITY);// la clase misma llama a un constructor que recibe parametros
    } // constructs stack with default capacity
    // objet: todos los datos inst strcig etc estan derivados de objet

    public ArrayStack(int capacity) { // constructs stack with given capacity
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
    }

    public int size() {
        return (t + 1);
    }

    public boolean isEmpty() {
        return (t == -1);
    }

    public void push(E e) throws IllegalStateException {// agega otro dato
        if (size() == data.length) {
            throw new IllegalStateException("Stack is full");// esepcion de capacidad asta que se llene la memoria
        }
        data[++t] = e; // increment t before storing new item
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[t];
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[t];
        data[t] = null; // dereference to help garbage collection
        t--;
        return answer;
    }
    // Metodo recursivo
    public void clear() {
        if (!isEmpty()) {
            pop(); // Eliminar el elemento superior
            clear(); // recursiva
        }
    }
    
    
    
    public void printStack() {
        if (isEmpty()) {
            System.out.println("El stack esta vacio."); // en vez de null, imprimir que est vacio
        } else {
            System.out.print("Elementos en el stack: ");
            for (int i = t; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
   
}

