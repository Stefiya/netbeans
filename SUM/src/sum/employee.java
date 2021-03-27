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
public class employee {
    float salary=4000;
}
class programmer extends employee{
    int bonus=1000;
    public static void main(String[] args)
    {
        programmer p=new programmer();
        System.out.println("programmer salary="+p.salary);
        System.out.println("bonus="+p.bonus);
    }
    
}
