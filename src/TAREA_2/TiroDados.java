
package TAREA_2;
import java.util.Random;
public class TiroDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] FreSuma =new int [13];
        
        int TotalTiros = 36000000;
        
        for (int i = 0; i < TotalTiros; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int suma = dado1 + dado2;
            FreSuma[suma]++;
        }
        
        System.out.printf("%-5s%-15s%n","Suma", "Frecuencia");
        for (int i = 2; i < FreSuma.length; i++) {
            System.out.printf("%-5d%-15s%n",i, FreSuma[i]);
        }
    }
}
