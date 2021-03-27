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
public class uplwstring {
    public static void main (String[]args)
    {
     String str;
    Scanner S=new Scanner(System.in);
    System.out.println("enter string");
    str=S.nextLine();
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());   
    }   
}
