
package Tema2_EstructuraLineal;

/**
 *
 * @author Brandy
 */
public class ArrayStackTest {

    public static void main(String[] args) {
//        Stack<Integer> S = new ArrayStack<>();
        Stack<String> S= new LinkedStack<>();
        Stack<String> T= new LinkedStack<>();
        
        S.push("C");
        S.push("B");
        S.push("A");
        System.out.println("Tamano de S= " + S.size());
        System.out.println("Tamano de T= " + T.size());
        System.out.println(S.top());
        System.out.println(T.top());
        transfer(S,T);
        System.out.println("Tamano de S= " + S.size());
        System.out.println("Tamano de T= " + T.size());
        System.out.println(S.top());
        System.out.println(T.top());
        mydelete(S);
        
    }
    
    public static <E> void transfer (Stack<E> S, Stack<E> T){
        while (!S.isEmpty()){
            T.push(S.pop());
        }
    }
    
    public static <E> void mydelete(Stack<E> S){
        if (S.isEmpty())return;
        S.pop();
        mydelete(S);
        
    }


}
