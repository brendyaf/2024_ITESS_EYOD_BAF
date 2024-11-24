
package Unidad3.EstructurasNoLineales;

import java.util.ArrayList;
import java.util.Iterator;
public class iteratorSample {
    public static void main(String[] args) {
        ArrayList <Double> data = new ArrayList<>();
        data.add(5.5);
        data.add(4.5);
        data.add(6.7);
        data.add(-6.7);
        data.add(3.6);
        
        System.out.println(data);
            
        Iterator<Double> walk = data.iterator();
        while (walk.hasNext( ))
        if (walk.next( ) < 0.0)
         walk.remove( );
                                                                            
        System.out.println(data);
    }
}
