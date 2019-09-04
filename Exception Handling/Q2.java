/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author sabiq
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static class Student{
          void openRegistrationPage(){
          long coursesOfferred[] = new long[1000000000];
          }
     }
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
            Student currentStudent= new Student();
            currentStudent.openRegistrationPage();
        } 
        catch (OutOfMemoryError error){
            System.out.println("Maximum user limit has reached");
            
        }
        finally
        {
          System.out.println("Registration Period is Active");
        }
     
        
    
    }
    
}
