/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
class circulo {

    private float radio;
    private float perimetro;
    private float diametro;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float rad) {
        radio = rad;
    }

    public void calculos() {
        Scanner r = new Scanner(System.in);
        System.out.println("Inserte radio: ");
        radio = r.nextFloat();
        if (radio < 0.1) {
            System.out.println("Inserte un Número valido");
        } else {
            System.out.println("El area es " + Math.pow(radio, 2) * Math.PI);
            System.out.println("El perimetro es " + ((2*radio) * Math.PI));
        }

    }
}
