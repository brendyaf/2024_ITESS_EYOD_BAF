
package Tema2_EstructuraLineal;


public class SinglyLinkedListTest  {
    
    public static void main(String[] args) {
        SinglyLinkedList <String> sll = new SinglyLinkedList <> ();
//        System.out.println("size"+ sll.size());
//        System.out.println("first" + sll.first());
//        System.out.println("last" + sll.last());
        
        sll.addFirst("sandra");
        System.out.println("size"+ sll.size());
        System.out.println("first" + sll.first());
        System.out.println("last" + sll.last());
        System.out.println("");

        sll.addFirst("vane");
        System.out.println("size"+ sll.size());
        System.out.println("first" + sll.first());
        System.out.println("last" + sll.last());
        System.out.println("");
        
        sll.addLast("dani");
        System.out.println("size"+ sll.size());
        System.out.println("first" + sll.first());
        System.out.println("last" + sll.last());
        System.out.println("");
        
        sll.addLast("bruno");
        System.out.println("size"+ sll.size());
        System.out.println("first" + sll.first());
        System.out.println("last" + sll.last());
        System.out.println("");
        
        sll.removeFirst();
        
        String dato = null;
        while ((dato = sll.removeFirst())!=null)
        System.out.print(dato+" ");
        System.out.println("");
    }
}
