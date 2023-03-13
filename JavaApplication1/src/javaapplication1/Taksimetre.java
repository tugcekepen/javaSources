package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
    
        double ACILIS = 10;
        double KM_BASI = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km cinsinden yazınız: ");
        double yol = input.nextDouble();

        double tutar = ((ACILIS+ yol*KM_BASI)<=20)? 20: (ACILIS+ yol * KM_BASI);

        System.out.println("Gidilen yol: " + yol);
        System.out.println("Taksimetre ücreti: "+ tutar);
    
    }
}
