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
class Bankaccount {

    private double bal;
    private String account;
    private String costumer;
    
    
    public String getAccount(){
                return account;

    }
    
    public void setAccount(String accoun){
        account = accoun;
    }
    public String getCustomer(){
                return costumer;

    }
    
    public void setCostumer(String costume){
        costumer = costume;
    }    
    public double getBal(){
        return bal;
    }
    public void setBal (double Balance){
        bal = Balance;
    }
    public void AccountSatus(){
        System.out.println("Numero de cuenta: "+account);
        System.out.println("Nombre de usuario: "+ costumer);
        System.out.println("Su balance total es de:  $"+bal);
    
    }
}
