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
public class objcycle {
    
    int gear=5;
    void show()
    {
    System.out.println("bicycle");
   }
    public static void main(String[] args) {
    objcycle sportbicycle=new objcycle();
    System.out.println(sportbicycle.gear);
    sportbicycle.show();
}
    
}    

