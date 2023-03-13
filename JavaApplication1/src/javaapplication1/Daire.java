package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class Daire {
    public static void main(String[] args){
        
        double pi = 3.14, r, alan, cevre, aci, dilimAlani;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz: ");
        r = input.nextDouble();
        
        alan = pi * r * r;
        cevre = 2 * pi * r;
        
        System.out.println("Çevre = " + cevre + "\nAlan = " + alan );
        System.out.println("---");
        System.out.print("Daire dilimi için;\nYarıçap giriniz: ");
        r = input.nextDouble();
        System.out.print("Açı giriniz: ");
        aci = input.nextDouble();
        
        dilimAlani = ( pi * r * r * aci) / 360;
        
        System.out.println("Yarıçap: " + r + "\nAçı: " + aci + "\nAlan = " + dilimAlani);
        
    }
}
