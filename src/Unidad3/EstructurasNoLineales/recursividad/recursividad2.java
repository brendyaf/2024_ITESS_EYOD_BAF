
package Unidad3.EstructurasNoLineales.recursividad;

/**
 *
 * @author Brandy Aguilar Flores
 */
public class recursividad2 {
    
    public static void main(String[] args) {
        
        int[] data = {1, 2, 3, 4, 5};
        System.out.println("Array original: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
        reverseArray(data, 0, data.length - 1);
        System.out.println("Array invertido: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
    //Reverses the contents of subarray data[low] through data[high] inclusive. ∗/
     public static void reverseArray(int[ ] data, int low, int high) {
     if (low < high) { // if at least two elements in subarray
     int temp = data[low]; // swap data[low] and data[high]
     data[low] = data[high];
     data[high] = temp;
     reverseArray(data, low + 1, high - 1); // recur on the rest
     }
    }
}
