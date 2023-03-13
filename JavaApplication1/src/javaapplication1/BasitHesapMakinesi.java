package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        
        double num1, num2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        num1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        num2 = input.nextDouble();
        
        System.out.println("---");
        
        System.out.println("İŞLEMLER\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem seçimiz nedir?: ");
        int select = input.nextInt();
        
        switch (select) {
            case 1:
                System.out.println("Sonuç = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Sonuç = " + (num1 / num2));
                break;
            default:
                System.out.println("Yanlış seçenek girdiniz!");
        }
        
    }
}
