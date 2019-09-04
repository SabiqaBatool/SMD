/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecommunication;

/**
 *
 * @author sabiq
 */
public class Application {
    private Messenger messenger;
    
    public void setListner(Messenger m)
    {
       this.messenger = m;
    }
    public void sendMessage()
    { 
       if(messenger.isProcessARunning())
       {
          messenger.recieveMessage("Stop wasting time",this);
       }
    }
    public void exitgame(String status)
    {
       System.err.println(status);
    }
    public void continuePlaying(String status)
    {
      System.err.println(status);
    }
    public boolean checkProcessAStatus()
    {
      return messenger.isProcessARunning();
    }
}
