/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author sabiqa
 */
public class Assignment1 {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // for q1 
   /* Employee e = new Intern();
    e.displayBenifits();
       
    Employee pm = new ProjectManager();
    pm.displayBenifits();
    */
    
     /*   Employee e = new Intern();
        e.calculatePay();
        e.printBalance();*/
        
        Employee pm = new ProjectManager();
        pm.displayBenifits();
        pm.calculatePay();
        pm.printBalance();
        
    
   
    
   }
}