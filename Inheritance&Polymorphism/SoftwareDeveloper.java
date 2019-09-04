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
public class SoftwareDeveloper extends Intern{

    public SoftwareDeveloper() {
        AllocateBenifits("dev benifits");
    }
    
    @Override
      public void calculatePay()
     {
         Scanner myObj = new Scanner(System.in);
         int workingHours;
         System.out.println("Enter Working hours for Software Developer"); 
         workingHours = myObj.nextInt(); 
         setPayPerHour();
         balance = PayPerHour * workingHours;   
     }
   
}
