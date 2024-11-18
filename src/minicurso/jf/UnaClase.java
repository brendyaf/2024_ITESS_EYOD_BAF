

/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
E Y OD
FRANCISCO JAVIER MONTECILLO PUENTE
BRANDY AGUILAR FLORES
DESCRIPCIÓN: ESTRUCTURA DE UNA CLASE
02/09/2024
*/
package minicurso.jf;
import java.util.*;

public class UnaClase {
    // Primero van los atributos
    
    private int A;
    private double B;
    private float C;
    // Segundo constructor
    public UnaClase(int A, double B, float C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    //Constructor vacio
    public UnaClase(
    ){};
    //Tercera, getters y setters

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public float getC() {
        return C;
    }

    public void setC(float C) {
        this.C = C;
    }

   
    
    
    
}
