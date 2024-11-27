
package Unidad3.EstructurasNoLineales.recursividad;

import java.util.List;
import java.util.ArrayList;

/** ITESS 2024
 * EyOD
 * 27/11/2024
 * Estes programa hacer permutaciones
 * @author Brandy Aguilar Flores
 */
public class PuzzleSolve {
    static int count=0;
    public static void main(String[] args) {
       
        ArrayList<Character> s = new ArrayList<>();
        ArrayList<Character> U = new ArrayList<>();
        U.add('A');
        U.add('B');
        U.add('C');
        
        
//        solve(k,(List<Character>)s, (List<Character>)U);
        System.out.println("Respuestas: ");
        solve(3, (List<Character>)s, (List<Character>)U);
        System.out.println("count: " + count);
        
        
    }
    public static void solve(int k, List<Character> s, List<Character> U){// k=cantidad de permutaciones
//        System.out.println("k :" + k);
//        for (int i = 0; i < s.size(); i++) {
//            System.out.print(s.get(i) + " ");
//        }
//        System.out.println("");
//        
//        for (int i = 0; i < U.size(); i++) {
//            System.out.print(U.get(i) + " ");
//        }
//        System.out.println("");
        
        int sizeU=U.size();
        for (int i = 0; i < sizeU; i++) {
            s.add(s.size(), U.get(i));
            
            // remove e from U
            U.remove(i);
            if(k ==1){
                printList("s:",s);
                count++;
            } else
                solve (k-1,s,U);
            
            Character c = s.get(s.size()-1);
            s.remove(s.size()-1);
            // Add e back to U
            U.add(i, c);         
        }
        
        
    }
    public static void printList(String msg, List<Character> s){
            System.out.print(msg);
            for (int i = 0; i < s.size(); i++) {
                System.out.print(s.get(i) + " ");
            }
            System.out.println("");
        }
    
}
