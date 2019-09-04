/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author sabiq
 */
public class Pet extends Animal implements Tricks
{

    @Override
    void eatFood() {
        System.out.println("WE FEED PETS");
    }
    
    public void play()
    {
        System.out.println("PET PLAYS"); 
    }

    @Override
    public void playDead() {
      System.out.println("I PLAY DEAD XD");
    }

    @Override
    public void chaseBall() {
      
      System.out.println("CHASEBALL");
    }
}
