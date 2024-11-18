/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
 E Y OD
 FRANCISCO JAVIER MONTECILLO PUENTE
 BRANDY AGUILAR FLORES
 DESCRIPCIÓN: TAREA 2
 13/09/2024
*/
package TAREA_2;

public class SalarioPorComision {
    private int [] ventas;
    private int [] histograma;
    private int [] salario;
    
    public enum Rango  {
        R200_299, R300_399, R400_499, R500_599, R600_699, R700_799, R800_899, R900_999, R1000// se les llama bin a estos
        
    };
    public static final int NUMERO_DE_CASILLAS = 9; // si es public static final es una buena practica que se nombre con mayusculas
    public SalarioPorComision(int[] ventas){
        this.ventas = ventas;
        // crear espacio a los datos
        this.salario = new int [ventas.length];
        this.histograma = new int [9];
        
    }
    
    public void CalcularSalario(){
        for (int i = 0; i < ventas.length; i++) {
            salario[i]=(int) (200 + 0.09f*ventas[i]);
            switch (salario[i]){
                case 200:
                case 299 : histograma[0]++;break;
                
            }
        }
    }
    
    public void imprimir(){
        System.out.println("VENTAS: ");
        for (int i = 0; i < ventas.length; i++){
            System.out.print(ventas[i] + " ");
        }
        System.out.println("");
        
        System.out.println("SALARIO: ");
        for (int i = 0; i < salario.length; i++){
            System.out.print(salario[i] + " ");
        }
        System.out.println("");
    }
}
