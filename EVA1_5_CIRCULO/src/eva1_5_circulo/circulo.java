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
    private float area;
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
            diametro = 2 * (radio);
            perimetro = (float) ((diametro) * Math.PI);
            area = (float) (Math.pow(2, radio) * Math.PI);
            System.out.println("El area es " + area);
            System.out.println("El perimetro es " + perimetro);
            System.out.println("El diametro es" + diametro);
        }

    }
}
