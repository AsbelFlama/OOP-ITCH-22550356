/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_sobrecarga2;

/**
 *
 * @author invitado
 */
public class EVA1_16_SOBRECARGA2 {

    
    public static void main(String[] args) {
        System.out.println("Suma int es: "+ suma(2, 4));
        System.out.println("Suma double es: " +suma(0.3, 0.25));
        System.out.println("Suma String es: " +suma("Hola", "mundo"));
        suma();
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    public static double suma(double val1,double val2){
        return val1 + val2;
    }
    public static String suma(String val1, String val2){
        return val1+val2;
    }
     public static void suma(){
         System.out.println("Suma: sin argumentos");
    }   
}
