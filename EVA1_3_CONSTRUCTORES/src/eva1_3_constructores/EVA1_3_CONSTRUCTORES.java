/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

/**
 *
 * @author Administrador
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Bankaccount cuenta1 = new Bankaccount();
    
    cuenta1.setAccount("002380");
    cuenta1.setCostumer("Asbel Ortega");
    cuenta1.setBal(4.04);
    cuenta1.AccountSatus();
    }
    
}
