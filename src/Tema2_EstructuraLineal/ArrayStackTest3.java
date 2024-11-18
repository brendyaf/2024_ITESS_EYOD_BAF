
package Tema2_EstructuraLineal;


public class ArrayStackTest3 {
    public static void main(String[] args) {
   
//    Stack<Integer> v= new ArrayStack<>();
//    Stack<String> S= new LinkedStack<>();
//    Stack<String> T= new LinkedStack<>();
    ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Antes del metodo recursivo:");
        stack.printStack();
        stack.clear();
        System.out.println("Despues del metodo recursivo:");
        stack.printStack();
    
//    v.push(5);
//    v.push(3);
//    System.out.println(v.pop()); 
//    v.push(2);
//    v.push(8);
//    System.out.println(v.pop()); 
//    System.out.println(v.pop()); 
//    v.push(9);
//    v.push(1);
//    System.out.println(v.pop());
//    v.push(7);
//    v.push(6);
//    System.out.println(v.pop());
//    System.out.println(v.pop());
//    v.push(4);
//    System.out.println(v.pop());
//    System.out.println(v.pop());
    }
}
