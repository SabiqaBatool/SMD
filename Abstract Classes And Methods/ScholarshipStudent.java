/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.util.Scanner;

/**
 *
 * @author sabiq
 */
public class ScholarshipStudent extends Student{
    
    @Override
    void calculatefee()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number of courses"); 
        setCourses(myObj.nextInt());
        System.out.println("Enter Fee Per Course"); 
        setfeePerCourse(myObj.nextInt());
        double discount_percentage = 0.5;
        int discount_amount = (int)(discount_percentage *(courses*feePerCourse));
        int totalfee = ((courses*feePerCourse) - (discount_amount));
        System.out.println("Total fee is "+ totalfee);
    }
}
