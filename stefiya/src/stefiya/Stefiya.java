/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stefiya;
  
/**
 *
 * @author Enter-Lab
 */
public class Stefiya {
        int mark=100;
}
   class Employee extends Stefiya{
       int mark1=150;
   }
class Student extends Stefiya{
    int mark2=80;
    
    public static void main(String[] args) {
        Employee e=new Employee();
        Student s=new Student();
        System.out.println("mark="+e.mark);
        System.out.println("mark1="+e.mark1);
        System.out.println("mark2="+s.mark2);
        
        
        // TODO code application logic here
    }
    
}
