/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
 E Y OD
 FRANCISCO JAVIER MONTECILLO PUENTE
 BRANDY AGUILAR FLORES
 DESCRIPCIÓN: TAREA 1
 11/09/2024
*/
package EDAlgo;


public class EDAlgoTP01 {
    public void E1_E1(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print('@');
                
            }
            System.out.println();
        }
 
    }
    
    
    public void E2(){
        System.out.println(" PROBLEMA A");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
                
            }
            System.out.println();
        }
    }
    
    public void E3(){
        System.out.println(" PROBLEMA B");
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print('*');
                
            }
            System.out.println();
        }
        
    }
    
    public void E4(){
        System.out.println(" PROBLEMA C");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j >= i)
                System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }
 
    }
    
    public void E5(){
        System.out.println(" PROBLEMA D");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
            if (j <= 10 -i )
                System.out.print(' ');
                else 
                    System.out.print('*');
                
            }
            System.out.println();
        }
        
    }
    
    public void E4_E1(){
        System.out.println("ROMBO");
        for (int i = 1; i <= 10; i++) {
            for (int j =1; j <= 10 -i+1;j ++){
                if (j >= i)
                System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println("");
        }
    }
    
    
    public void E5_E1(){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 3; j++) {
                for (int k = 1; k < 4; k++) {
                    System.out.print('*');
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }
    
    
   
}
