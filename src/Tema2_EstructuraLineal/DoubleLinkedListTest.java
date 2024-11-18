
package Tema2_EstructuraLineal;

public class DoubleLinkedListTest {
    public static void main(String[] args) {
        Test1();
        Test2();
        Test3();
        Test4();
    }
    
    public static void Test1(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        // addfirst : D C B A
        dll.addFirst("D");
        dll.addFirst("C");
        dll.addFirst("B");
        dll.addFirst("A");
        System.out.println("First: " + dll.removeFirst());
        System.out.println("First: " + dll.removeFirst());
        System.out.println("First: " + dll.removeFirst());
        System.out.println("First: " + dll.removeFirst());
        System.out.println("");
    }
    
    public static void Test2(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        // addLast: A B C D
        dll.addLast("A");
        dll.addLast("B");
        dll.addLast("C");
        dll.addLast("D");
        
        System.out.println("Last: " + dll.removeLast());
        System.out.println("Last: " + dll.removeLast());
        System.out.println("Last: " + dll.removeLast());
        System.out.println("Last: " + dll.removeLast());
        System.out.println("");
    }
    public static void Test3(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.addFirst("A");
        dll.addLast("D");
        dll.addFirst("B");
        dll.addLast("C");
        
        System.out.println("First: " + dll.removeFirst());
        System.out.println("Last: " + dll.removeLast());
        System.out.println("First: " + dll.removeFirst());
        System.out.println("Last: " + dll.removeLast());
        System.out.println("");
        
    }
    
    public static void Test4(){
        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
        dll.addLast("D");
        dll.addFirst("A");
        dll.addLast("C");
        dll.addFirst("B");
        
        System.out.println("Last: " + dll.removeLast());
        System.out.println("First: " + dll.removeFirst());
        System.out.println("Last: " + dll.removeLast());
        System.out.println("First: " + dll.removeFirst());
        
        
    }
}
