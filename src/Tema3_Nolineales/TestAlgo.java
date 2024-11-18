
package Tema3_Nolineales;

/**
 *
 * @author Brandy
 */
public class TestAlgo {
    public static void main(String[] args) {
        Algo fi = new Algo();
        System.out.println(fi.fibonaacci2(50));
        long startTime=System.nanoTime();
        fi.fibonaacci2(50);
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1e6  + "ms");
    }
}
