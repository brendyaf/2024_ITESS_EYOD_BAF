package Tema2_EstructuraLineal;

import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        demoLibro();
        System.out.println("");
        demonDouble();
    }
    
    public static void demoLibro(){ //cuanso tenemos un static en un metodo de instancia solo se pueden acceder a la instancia en ellos
        ArrayList<Character> al = new ArrayList<>();
        al.add(0,'A');
        al.add(0,'B');
        System.out.println(al.get(1));
        try {
            al.set(2,'C');
        }catch (IndexOutOfBoundsException ibe){
            System.out.println("Operation cannot be done!!!.");
        }
        al.add(2,'C');
        
        try {
            al.add(4, 'D');
        }catch(IndexOutOfBoundsException iba){
            System.out.println("Operation cannot be done!!!.");
        }
        System.out.println(al.remove(1));
        al.add(1, 'D');
        al.add(1, 'E');
        
        try{
            System.out.println(al.get(4));
        } catch (IndexOutOfBoundsException b){
            System.out.println("Operation cannot be done!!!.");
        }
        al.add(4, 'F');
        System.out.println( al.set(2, 'G'));
        System.out.println(al.get(2));
        
        
         
                
    }
    public static void demonDouble(){
        ArrayList<Double> al = new ArrayList<>();
        al.add(0,1.0);
        al.add(1,2.0);
        al.add(0,0.0);
        
        System.out.println(al.remove(0));
        System.out.println(al.remove(0));
        System.out.println(al.remove(0));
        
        // iterator
        al.add(0,1.0);
        al.add(1,-2.0);
        al.add(0,0.0);
        
        System.out.println(al);
        Iterator<Double> walk = al.iterator(); // filtrado de datos
        while (walk.hasNext( ))
            if (walk.next( ) < 0.0)
                walk.remove( );
        
        System.out.println(al);
    }
}
