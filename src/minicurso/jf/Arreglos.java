
/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
 E Y OD
 FRANCISCO JAVIER MONTECILLO PUENTE
 BRANDY AGUILAR FLORES
 DESCRIPCIÓN: REPASAR ARREGLOS
 03/09/2024
*/
package minicurso.jf;

public class Arreglos {
    private int Arr[]= new int [10] ;
    
    // 2
    public void fill0to9(){
        for (int i =0; i < Arr.length; i++){
            Arr[i] = i;
        }
        
    }
    // 3
    public void clean(){
        for (int i = 0; i < Arr.length; i++){
            Arr[i] = 0;
        }
        
    }   
    
    
    // 4 
    public void nosVer1(){
        for (int i =0; i < Arr.length; i++){
           
            if( i % 2 == 0){
                Arr[i]=1;
                
            }else
                Arr[i]=0;
        }
        
    }
    //5
    public void unosVer2(){
        for (int i=0; i < Arr.length; i ++ ){
            if(i % 2 != 0){
                Arr[i]=1;
                }else {
                Arr[i]=0;
            }
        }
    }
    
    
    //6
    public void from9to0(){
        for (int i =0; i < Arr.length; i++){
            Arr[i] = Arr.length - 1 - i;
        }
        
    }
    
    public void shiftRight(){
        int aux1 = Arr[0];
        int aux2 = Arr[0];
      
        for (int i =0; i < Arr.length -1 ;i++){
           
            aux2 = Arr[i+1];
            Arr[i+1] = aux1;
            aux1 = aux2;
                    
        }
        Arr[0]=aux1;
    }
    
    // 1
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < Arr.length; i++){
            str += Arr[i] + " ";
        }
        return str;
        
    }
    
    
    
}
