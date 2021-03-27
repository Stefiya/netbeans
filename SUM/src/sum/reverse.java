/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author Enter-Lab
 */
public class reverse {
    public static void main(String[] args)
    {
    int n,rem,rev=0;
    Scanner S=new Scanner(System.in);
    System.out.println("enter  number");
    n=S.nextInt();

    while(n>1)
    {
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
    }
    System.out.println("reverse of number is" +rev);
    }
}
