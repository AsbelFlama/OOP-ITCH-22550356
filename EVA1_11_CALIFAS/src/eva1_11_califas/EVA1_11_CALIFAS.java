/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_califas;

/**
 *
 * @author invitado
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String resul = califas(85);
        System.out.println("Su calificacion en US es "+resul);
    }
    
    
    public static String califas(int calif){
        String resu="";
        if (calif >=91&&calif<=100)
            resu=("A");
        if (calif >=81&&calif<=90)
              resu=("B");
        if (calif >=71&&calif<=80)
              resu=("C");
        if (calif <70)
              resu=("D");
        return resu;
            
        
    }
}
