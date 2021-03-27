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
public class ADDNUMBER {
 public static void main(String[] args) 
 {
   int num1,num2,sum;
  Scanner S=new Scanner(System.in);
  System.out.println("enter first number");
  num1=S.nextInt();
  System.out.println("enter second number");
  num2=S.nextInt();
  sum=num1+num2;
  System.out.println(sum);
}
}
