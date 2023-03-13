package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg) giriniz: ");
        kilo = input.nextDouble();
        
        double vki = (kilo / (boy * boy)) ;
        
        System.out.println("Vücut kile indeksiniz = " + vki);
    }
}
