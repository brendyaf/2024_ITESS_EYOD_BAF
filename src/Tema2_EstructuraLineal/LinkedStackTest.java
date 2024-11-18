
package Tema2_EstructuraLineal;

/**
 *programacion generica 
 * 
 * @author Admi
 */
public class LinkedStackTest {
     public static void main(String[] args) {
        Stack<Integer> S = new LinkedStack<>();
        S.push(5);
        S.push(3); 
        System.out.println(S.size()); 
        System.out.println(S.pop()); 
        System.out.println(S.isEmpty()); 
        System.out.println(S.pop()); // contents: () outputs
        System.out.println(S.isEmpty()); 
        System.out.println(S.pop()); 
        S.push(7); 
        S.push(9); 
        System.out.println(S.top()); 
        S.push(4); 
        System.out.println(S.size()); 
        System.out.println(S.pop()); 
        S.push(6); 
        S.push(8); 
        System.out.println(S.pop());
    }

}
