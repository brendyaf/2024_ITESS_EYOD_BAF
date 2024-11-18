
package Tema2_EstructuraLineal;


public class SlotsGane {
    public static void main(String[] args) {
        CircularlyLinkedList cll1 = new CircularlyLinkedList();
        CircularlyLinkedList cll2 = new CircularlyLinkedList();
          
          cll1.addFirst(1);
          cll1.addFirst(2);
          cll2.addFirst(1);
          cll2.addFirst(2);
          
          int NRotaciones = (int)(Math.random()* 10 + 1);
          
          for (int i = 0; i < NRotaciones ; i++) {
              cll1.rotate();
            }
           
           
          int NRotaciones2 = (int)(Math.random()* 10 + 1);
          for (int i = 0; i < NRotaciones2; i++) {
            cll2.rotate();
        }
          System.out.println(cll1.first());
          System.out.println(cll2.first());

    }
}
