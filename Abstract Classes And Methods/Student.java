/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author sabiq
 */
public abstract class Student {
    public int courses;
    public int feePerCourse;
    abstract void calculatefee();
   
    public void setCourses(int c)
    {
        courses = c;
    }
    public void setfeePerCourse(int fee)
    {
        feePerCourse = fee;
    }
}
