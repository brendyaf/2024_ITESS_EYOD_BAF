
package Tema3_Nolineales;

/**
 * 11-11-2024
 * @author Brandy
 */
public class Algo {
    public static int fivo[]=new int[100];
    
    public int fibonacci1(int n){
        if ( n==1 || n==0){
            return n;
        }
        else 
            return fibonacci1(n-1)+ fibonacci1(n-2);
    }
    
    public int fibonaacci2(int n){
        fivo[0]=0;
        fivo[1]=1;
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        for (int i = 2; i <= n; i++) {
            fivo[i]= fivo[i-1]+ fivo[i-2];
        }
            return fivo[n];
    }
}
