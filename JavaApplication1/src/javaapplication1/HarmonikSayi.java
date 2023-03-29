package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        
        double toplam=0;
        for (int i = 1; i <= sayi; i++) {
            toplam += 1.0/i;
        }
        
        System.out.println("Harmonik sayı = "+toplam);
    }
}
