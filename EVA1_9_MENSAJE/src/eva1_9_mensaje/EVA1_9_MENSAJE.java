/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_mensaje;

/**
 *
 * @author invitado
 */
public class EVA1_9_MENSAJE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nPrintLn("Hola", 5);
    }
    public static void nPrintLn(String message, int num){
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
    
}
