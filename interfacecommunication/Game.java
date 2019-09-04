/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecommunication;

import java.util.Scanner;

/**
 *
 * @author sabiq
 */
public class Game implements Messenger{
    
   public boolean processA;
    public void setSystemListner(Application s)
    {
       startProcessA();
       s.setListner(this);
       
    }
    public void startProcessA()
    {
       processA = true;
    }
    @Override
    public boolean isProcessARunning() {
      if(processA == true)
      {
        return true;
      }
      return false;
    }

   

    @Override
    public void recieveMessage(String message,Application application) {
       if(message!=null)
       {
         
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1 to exit game or 2 to continue playing"); 
        if(myObj.nextInt()==1)
        {
           processA = false;
           application.exitgame("exit game");
        }
        else
        {
           application.continuePlaying("continue game");
        } 
          
          
       }
    }

    
}
