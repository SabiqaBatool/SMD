/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * @author sabiq
 */
public class Employee {
    
    public ArrayList<String>benifits;
    public int PayPerHour;
    public int balance;  

    public Employee() {
    
       benifits = new ArrayList();

    }
     
     public void AllocateBenifits(String benifit)
     {
          
          benifits.add(benifit);
     }
     protected ArrayList<String> getBenifits()
     {
        
          if(!benifits.isEmpty())
          {
              return benifits;
          } else {
              return null;
         }
     }
     protected void displayBenifits()
     {
       System.out.println(benifits);
     }
     
     public void calculatePay()
     {
         Scanner myObj = new Scanner(System.in);
         int workingHours;
         System.out.println("Enter Working hours"); 
         workingHours = myObj.nextInt(); 
         setPayPerHour();
         balance = PayPerHour * workingHours;   
     }
     
     public void setPayPerHour()
     {
         Scanner myObj = new Scanner(System.in);
         System.out.println("Enter Pay per hours"); 
         PayPerHour = myObj.nextInt();
     }
     
     public void printBalance()
     {
       System.out.println("Your balance is" + balance);
     }
     
}
