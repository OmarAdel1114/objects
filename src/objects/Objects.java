/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

public class Objects {
static class Mouse{
String brand;
String color;
boolean hasRGB;

Mouse(String brand, String color, boolean hasRGB){
this.brand= brand;
this.color= color;
this.hasRGB= hasRGB;
}

    }
  
    
    
    public static void main(String[] args) {
        Mouse redDragon = new Mouse("MSI","Black",true);
System.out.println("The mouse");
System.out.println(redDragon.brand);
System.out.println(redDragon.color);
System.out.println(redDragon.hasRGB);
}


    
}
