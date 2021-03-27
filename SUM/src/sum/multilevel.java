/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

/**
 *
 * @author Enter-Lab
 */
public class multilevel{
    int age=32;
}
    class Employee extends multilevel {
    float salary=5000;
}
     class student extends Employee{
    int bonus=1000;

    public static void main(String[] args)
    {

    student s=new student();

   System.out.println("age="+s.age);
   System.out.println("sal="+s.salary);
    System.out.println("bonus="+s.bonus);
        
    }
    }
