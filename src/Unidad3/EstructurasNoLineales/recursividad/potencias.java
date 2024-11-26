
package Unidad3.EstructurasNoLineales.recursividad;

import Tema3_Nolineales.Algo;

/**
 *
 * @author Brandy Aguilar Flores
 */
public class potencias {
    public static void main(String[] args) {
        System.out.println("POWER GOOD");
        long startTime=System.nanoTime();
        System.out.println(powerGood(3, 10));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1e6  + "ms"); 
       
        
        
    }
    
    public static double powerBad(double x, int n) {
    
    if (n == 0)
    return 1;
    else
        return x * powerBad (x, n-1);
    }
    
    public static double powerGood(double x, int n) {
    if (n == 0)
     return 1;
     else {
     double partial = powerGood(x, n/2); // rely on truncated division of n
    double result = partial * partial;
     if (n % 2 == 1) // if n odd, include extra factor of x
     result *= x;
     return result;
     }
     }
    
}
