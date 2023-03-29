package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class KuvvetHesaplama {
    public static void main(String[] args) {
        hesap(2);
        hesap(4);
        hesap(5);
    }
    
    public static void hesap(int taban) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print(taban + " için hesaplanacak kuvvet sayısını giriniz: ");
        sayi = scan.nextInt();
        for(int i=0; i<=sayi; i++){
            System.out.println(taban + " üzeri " + i + " = " + (int)Math.pow(taban, i));
        }
    }
}
