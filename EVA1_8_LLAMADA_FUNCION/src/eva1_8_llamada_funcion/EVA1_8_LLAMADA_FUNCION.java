/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_llamada_funcion;

/**
 *
 * @author invitado
 */
public class EVA1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }
    public static void A(){
        System.out.println("inicia a()");
        B();
        System.out.println("termina a()");
    }
    public static void B(){
        System.out.println("inicia b()");

        System.out.println("termina b()");
    }
}
