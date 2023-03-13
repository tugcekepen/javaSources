package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class KDVTutariHesap {
    public static void main(String[] args) {
        
        double para, kdvliTutar;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        para = input.nextDouble();
        
        double KDV_TUTARI = (para>=0 && para<=1000)? 0.18: 0.08;
        
        kdvliTutar = para + (para * KDV_TUTARI);
        
        System.out.println("KDV'siz tutar: "+ para);
        System.out.println("KDV'li tutar: "+ kdvliTutar);
        System.out.println("KDV tutarı: "+ para*KDV_TUTARI);
        
    }
}
