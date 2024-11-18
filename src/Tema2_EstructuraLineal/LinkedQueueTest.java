
package Tema2_EstructuraLineal;

/**
 *
 * @author Brandy
 */
public class LinkedQueueTest {
    public static void main(String[] args) {
        Queue<Integer> Q =  new LinkedQueue<>();
        Q.enqueue(5);
        Q.enqueue(3);
        System.out.println(Q.size());
        System.out.println(Q.dequeue());
        System.out.println(Q.isEmpty());
        System.out.println(Q.dequeue());
        System.out.println(Q.isEmpty());
        System.out.println(Q.dequeue());
        Q.enqueue(7);
        Q.enqueue(9);
        System.out.println(Q.first());
        Q.enqueue(4);
    }
}
