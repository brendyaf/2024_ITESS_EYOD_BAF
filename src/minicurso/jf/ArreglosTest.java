/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
 E Y OD
 FRANCISCO JAVIER MONTECILLO PUENTE
 BRANDY AGUILAR FLORES
 DESCRIPCIÓN: REPASAR ARREGLOS
 03/09/2024
*/
package minicurso.jf;


public class ArreglosTest {
    public static void main(String[] args) {
        Arreglos arr = new Arreglos();
    
        arr.fill0to9();
        System.out.println(arr.toString());
        
        arr.clean();
        System.out.println(arr.toString());
        
        arr.nosVer1();
        System.out.println(arr.toString());
        
        arr.unosVer2();
        System.out.println(arr.toString());
        
        arr.fill0to9();
        arr.shiftRight();
        System.out.println(arr.toString());
    }
}
