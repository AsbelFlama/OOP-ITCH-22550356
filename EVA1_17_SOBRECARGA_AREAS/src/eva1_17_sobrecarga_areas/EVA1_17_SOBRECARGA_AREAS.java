/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El area de un circulo de radio 18.25 es " + area(18.25));
        System.out.println("El area de un triangulo de base 18.25 y altura 15 es " + area(18.25, 15));
        System.out.println("El area de un trapecio de base > de 18.25, base < 15 y altura 10 es " + area(18.25, 15, 10 ));
        area();
    }

    public static double area(double val1) {
        return (Math.pow(val1, 2.0)) * Math.PI;
    }

    public static double area(double val1, double val2) {
        return (val1 * val2) / 2.0;
    }

    public static double area(double val1, double val2, double val3) {
        return ((val1 + val2) / 2.0) * val3;
    }
    public static void area(){
        System.out.println("Valor de area indeterminado");
    }
}
