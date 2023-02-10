/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_2_clases;

import javax.swing.JPanel;

/**
 *
 * @author invitado
 */
public class EVA_1_2_CLASES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        
        
        perso1.setNombre("Asbel");
        perso1.setApellidos("Piña Ortega");
        perso1.setEdad(22);
        perso1.setGenero('h');
         
       perso1.imprimirDatos();
        
        Persona perso2 = new Persona();

        perso2.setNombre("Mario");
        perso2.setApellidos("Ortega Piña");
        perso2.setEdad(21);
        perso2.setGenero('T');
        perso2.imprimirDatos();
    }
    
}
