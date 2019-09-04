/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author sabiqa
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("HI I AM WILD ANIMAL");
        Animal a = new WildAnimal();
        a.sleep();
        a.walk();
        a.eatFood();
        
        System.out.println(" ");
        System.out.println("HI I AM A PET");
        Pet pet = new Pet();
        pet.sleep();
        pet.walk();
        pet.eatFood();
        pet.playDead();
        pet.chaseBall();
        pet.playDead();
        
    }
    
}
