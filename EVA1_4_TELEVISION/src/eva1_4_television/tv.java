/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_television;

/**
 *
 * @author invitado
 */
class tv {

    private boolean power;
    private int volumen;
    private int canal;
    private boolean vool;

    public tv() {
        power = false;
        volumen = 0;
        canal = 11;
    }

    public void cambiarpower() {
        if (power == false) {
            power = true;
            System.out.println("Television encendida");
        } else {
            power = false;
            System.out.println("Television apagada");            

        }
    }
    public void volup(){
        if (power == true){
        if (volumen < 100)             
        volumen=volumen+5;
            System.out.println("Volumen:  "+volumen);            
        
    }
    }
        public void voldn(){
        if (power == true){
        if (volumen > 0)    
        volumen=volumen-5;
            System.out.println("Volumen:  "+volumen);
    }
        }
        public void subircanal(){
         if (power == true)
             canal=canal+1;
         if (canal > 100)
             canal=1;
         System.out.println("Canal+: "+ canal);
         
        }
        public void bajarcanal(){
         if (power == true)
             canal=canal-1;
         if (canal < 0)
             canal=100;
         System.out.println("Canal-: "+ canal);
        }        
}


