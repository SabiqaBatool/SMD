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
public interface Messenger {
    
    boolean isProcessARunning();
    void recieveMessage(String message,Application system);
}
