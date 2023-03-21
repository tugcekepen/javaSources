package javaapplication1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TugceK
 */
public class Zodyak {
    public static void main(String[] args) {
        int yil, kalan;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınız: ");
        yil = input.nextInt();
        
        var burclar = new String[]{
            "Maymun",
            "Horoz",
            "Köpek", 
            "Domuz",
            "Fare",
            "Öküz",
            "Kaplan",
            "Tavşan",
            "Ejderha",
            "Yılan",
            "At",
            "Koyun"
        };
        
        kalan = yil % 12;

        for (int i =0 ; i<12; i++){
            if (kalan == i){
                System.out.println("Zodyak burcunuz: " + burclar[i]);
            }
        }
    }  
}
