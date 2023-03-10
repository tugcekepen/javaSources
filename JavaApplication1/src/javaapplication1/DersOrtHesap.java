package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class DersOrtHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        int matNotu = input.nextInt();
        
        System.out.print("Fizik notunuzu giriniz: ");
        int fizikNotu = input.nextInt();
        
        System.out.print("Kimya notunuzu giriniz: ");
        int kimyaNotu = input.nextInt();
        
        System.out.print("Türkçe notunuzu giriniz: ");
        int turkceNotu = input.nextInt();
        
        System.out.print("Tarih notunuzu giriniz: ");
        int tarihNotu = input.nextInt();
       
        System.out.print("Müzik notunuzu giriniz: ");
        int muzikNotu = input.nextInt();
        
        float ortalama = (matNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu) / 6f;
        
        System.out.println("Ortalama: " + ortalama);
        
        String sonuc = (ortalama>=60.0)? "Geçti" : "Kaldı";
        
        System.out.println(sonuc);
    }
}
