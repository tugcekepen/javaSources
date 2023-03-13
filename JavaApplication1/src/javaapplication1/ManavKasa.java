package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        
        double armut, elma, domates, muz, patlican;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;
        
        double aKg, eKg, dKg, mKg, pKg, ucret;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut? : ");
        aKg = input.nextDouble();
        System.out.print("Kaç kilo elma? : ");
        eKg = input.nextDouble();
        System.out.print("Kaç kilo domates? : ");
        dKg = input.nextDouble();
        System.out.print("Kaç kilo muz? : ");
        mKg = input.nextDouble();
        System.out.print("Kaç kilo patlıcan? : ");
        pKg = input.nextDouble();
        
        ucret = armut*aKg + elma*eKg + domates*dKg + muz*mKg + patlican*pKg;
        
        System.out.println("Toplam ödeme = " + ucret + " TL");
        
    }
}
