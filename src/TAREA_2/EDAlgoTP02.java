
package TAREA_2;


public class EDAlgoTP02 {
    public static void main(String[] args) {
        EDAlgoTP02 E = new EDAlgoTP02();
//        E.a();
//        E.b();
//        E.c();
//          E.d();
          E.e();

    }
    public void a(){
        int[] f = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("El valor del sexto elemento es: " + f[5]);
      
    }
    public void b (){
        int[] g = new int[5];
      for (int i = 0; i < g.length; i++) {
        g[i] = 8;
      }
      System.out.println("Valores del arreglo g:");
        for (int i = 0; i < g.length; i++) {
            System.out.println("Elemento " + i + ": " + g[i]);
        }
       
        
    }
    public void c(){
        float[] c = new float[100];

        for (int i = 0; i < c.length; i++) {
            c[i] = 32.0f;  // Puedes reemplazar con otros valores
        }

       
        float suma = 0;
        for (int i = 0; i < c.length; i++) {
            suma += c[i];
        }

        // Mostrar el total de la suma
        System.out.println("La suma de los 100 elementos es: " + suma);
    }
    
    public void d (){
        int[] a = {11, 82, 33, 43, 75, 93, 67, 88, 4, 10, 110};
        int[] b = new int[34];

 
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Valores del arreglo b al copiar a:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Elemento " + i + "= " + b[i]);
        }
    }
    
    public void e (){
        float[] w = new float[99];

       
        for (int i = 0; i < w.length; i++) {
            w[i] = (float) Math.random() * 100; 
        }

       
        float menor = w[0];
        float mayor = w[0];

       
        for (int i = 1; i < w.length; i++) {
            if (w[i] < menor) {
                menor = w[i];
            }
            if (w[i] > mayor) {
                mayor = w[i];
            }
        }
        System.out.println("Valor menor: " + menor);
        System.out.println("Valor mayor: " + mayor);
    }
    
    
    
}

