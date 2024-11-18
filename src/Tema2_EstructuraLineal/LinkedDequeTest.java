
package Tema2_EstructuraLineal;

/**
 *
 * @author Brandy
 */
public class LinkedDequeTest {
    public static void main(String[] args) {
        Deque<Integer> D = new LinkedDeque<>();
        D.addFirst(3);
        D.addLast(8);
        D.addLast(9);
        System.out.println(D.last());
        System.out.println(D.isEmpty());
        D.addFirst(2);
        System.out.println(D.removeLast());
        D.addLast(7);
        System.out.println(D.first());
        System.out.println(D.last());
        D.addLast(4);
        System.out.println(D.size());
        System.out.println(D.removeFirst());
        System.out.println(D.removeFirst());
    }
}
