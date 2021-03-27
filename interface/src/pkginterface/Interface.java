/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
interface printable{
    void print();
    }
/**
 *
 * @author Enter-Lab
 */
public class Interface implements printable {
    public void print()
    {
        System.out.println("hello");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface obj=new Interface();
                obj.print();
        // TODO code application logic here
    }
    
}
