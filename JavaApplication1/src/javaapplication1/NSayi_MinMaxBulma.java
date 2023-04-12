package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class NSayi_MinMaxBulma {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int adet = scan.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        sayi = scan.nextInt();
        int min = sayi;
        int max = sayi;
        for (int i = 2; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = scan.nextInt();
            if(sayi<=min){
                min = sayi;
            }
            if(sayi>=max){
                max = sayi;
            }
        }
        System.out.println("Min = " + min + "\nMax = " + max);
    }    
}
