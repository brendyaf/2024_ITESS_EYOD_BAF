
package Unidad3.EstructurasNoLineales.recursividad;

/**
 *
 * @author Brandy Aguilar Flores
 */
public class RecursionBinaria {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println ("El arreglo es: ");
            for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        int result = binarySum(data, 0, data.length - 1);
        System.out.println("");
       
        System.out.println("La suma de los elementos es: " + result);
        
        int[] data2 = {3, 8, 2, 4, 6};
        System.out.println ("El arreglo es: ");
            for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i] + " ");
        }
        int result2 = binarySum(data2, 0, data2.length - 1);
        System.out.println("");
       
        System.out.println("La suma de los elementos es: " + result2);
        
        int[] data3 = {42, 10, 7, 4, 12};
        System.out.println ("El arreglo es: ");
            for (int i = 0; i < data3.length; i++) {
            System.out.print(data3[i] + " ");
        }
        int result3 = binarySum(data3, 0, data3.length - 1);
        System.out.println("");
       
        System.out.println("La suma de los elementos es: " + result3);
        
        
        
    }
    
    public static int binarySum(int[ ] data, int low, int high) {
     if (low > high) // zero elements in subarray
     return 0;
     else if (low == high) // one element in subarray
     return data[low];
     else {
     int mid = (low + high) / 2;
    return binarySum(data, low, mid) + binarySum(data, mid+1, high);
    }
    }
}
