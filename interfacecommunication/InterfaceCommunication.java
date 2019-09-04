/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecommunication;


import java.util.concurrent.TimeUnit;

/**
 *
 * @author sabiq
 */
public class InterfaceCommunication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Game g = new Game();
     Application s = new Application();
     g.setSystemListner(s);
    
            
            do{
               try {
         
                    TimeUnit.SECONDS.sleep(60); // delay for 60 seconds
                    s.sendMessage();
         
                  } 
             catch (InterruptedException e) {
                 System.err.format("IOException: %s%n", e);
             }
            }while(s.checkProcessAStatus());
     
     
     
    
    }
    
}
