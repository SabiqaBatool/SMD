/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author sabiq
 */
public class Intern extends Employee{

    public Intern() {
        
        AllocateBenifits("basic benifits");
       
    }
   
    @Override
      public void calculatePay()
     {
         Scanner myObj = new Scanner(System.in);
         int workingHours;
         System.out.println("Enter Working hours for Intern"); 
         workingHours = myObj.nextInt(); 
         setPayPerHour();
         balance = PayPerHour * workingHours;   
     }
   
}
