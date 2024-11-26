
package Unidad3.EstructurasNoLineales.recursividad;

/**
 *
 * @author Brandy
 */
public class recursividad {
    // Returns the sum of the first n integers of the given array. ∗/
    public static int linearSum(int[ ] data, int n) {
    if (n == 0)
    return 0;
    else
    return linearSum(data, n-1) + data[n-1];
   
    }
      public static void main(String[] args) {
          System.out.println("EJEMPLO 1-----------------------");
        int[] data = {4, 6, 3, 2, 8};
        int n = data.length; 
        int result = linearSum(data, n);

        System.out.println("La suma de los primeros " + n + " elementos es: " + result);
        
        System.out.println("EJEMPLO 2-----------------------");
        int[] data2 = {1, 4, 3, 9};
        int n2 = data2.length; 
        int result2 = linearSum(data2, n2);
        System.out.println("La suma de los primeros " + n2 + " elementos es: " + result2);
        
        System.out.println("EJEMPLO 3-----------------------");
        int[] data3 = {7, 3, 6, 0};
        int n3 = data3.length; 
        int result3 = linearSum(data3, n3);
        System.out.println("La suma de los primeros " + n3 + " elementos es: " + result3);  
    }
      

 
}
