package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args){
        // Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        // Geçme notu : 55
        
        double mat, fizik, turkce, kimya, muzik, ortalama;
        int GECME_NOTU = 55, dersSayisi = 5;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Sınav notlarınızı giriniz.");
        
        System.out.print("Matematik: ");
        mat = input.nextDouble();
        if (mat<0 || mat>100) {
            mat = 0;
            dersSayisi--;
        }
        
        System.out.print("Fizik: ");
        fizik = input.nextDouble();
        if (fizik<0 || fizik>100) {
            fizik = 0;
            dersSayisi--;
        }
        
        System.out.print("Türkçe: ");
        turkce = input.nextDouble();
        if (turkce<0 || turkce>100) {
            turkce = 0;
            dersSayisi--;
        }
        
        System.out.print("Kimya: ");
        kimya = input.nextDouble();
        if (kimya<0 || kimya>100) {
            kimya = 0;
            dersSayisi--;
        }
        
        System.out.print("Müzik: ");
        muzik = input.nextDouble();
        if (muzik<0 || muzik>100) {
            muzik = 0;
            dersSayisi--;
        }
        
        ortalama = ( mat + fizik + kimya + turkce + muzik ) / dersSayisi;
        
        if (ortalama >= GECME_NOTU) {
            System.out.println("Geçti!\nOrtalama = " + ortalama);
        }
        else {
            System.out.println("Kaldı!\nOrtalama = " + ortalama);
        }  
    }
}
