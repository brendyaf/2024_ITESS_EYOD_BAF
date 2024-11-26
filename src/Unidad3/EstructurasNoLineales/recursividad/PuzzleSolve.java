
package Unidad3.EstructurasNoLineales.recursividad;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Brandy Aguilar Flores
 */
public class PuzzleSolve {
    
    public static void main(String[] args) {
        int k =3;
        ArrayList<Character> s = new ArrayList<>();
        ArrayList<Character> U = new ArrayList<>();
        U.add('A');
        U.add('B');
        U.add('C');
        
        solve(k,(List<Character>)s, (List<Character>)U);
        
    }
    public static void solve(int k, List<Character> s, List<Character> U){
        System.out.println("k :" + k);
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < U.size(); i++) {
            System.out.print(U.get(i) + " ");
        }
        System.out.println("");
        
        
    }
    
    
}
