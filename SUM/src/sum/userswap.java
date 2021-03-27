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
import java.util.Scanner;
public class userswap {
    public static void main(String[] args)
    {
    int a,b,temp;
    Scanner S=new Scanner(System.in);
    System.out.println("enter 1st number");
    a=S.nextInt();
    System.out.println("enter 2nd number");
    b=S.nextInt();
    temp=a;
    a=b;
    b=temp;
    System.out.println("a="+a+" b="+b);
    }  
}
