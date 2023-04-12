package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class PalindromSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = input.nextInt();
        Polindrom(sayi);
    }
    
    public static void Polindrom(int sayi){
        String s = String.valueOf(sayi);
        var tersSayi = "";
        int kalan = sayi % 10, bolum=sayi/10;
        tersSayi += String.valueOf(kalan);
        while(bolum>=1){
            kalan = bolum % 10;
            tersSayi += String.valueOf(kalan);
            bolum = bolum/10;
        }
        if(s.equals(tersSayi)){
            System.out.println("Polindrom sayıdır.");
        }else{
            System.out.println("Polindrom sayı değildir.");
        }
    }
}
