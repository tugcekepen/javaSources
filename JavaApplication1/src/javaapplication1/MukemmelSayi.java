package javaapplication1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author TugceK
 */
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = input.nextInt();
        if(sayi>0){
            LinkedList<Integer> bolenler = new LinkedList<Integer>();
            for (int i = 1; i < sayi; i++) {
                if (sayi%i==0){
                    bolenler.add(i);
                }
            }

            int toplam = 0;
            for (Integer b : bolenler) {
                toplam += b;
            }

            if (toplam == sayi){
                System.out.println(sayi + " mükemmel sayıdır.");
            }else{
                System.out.println(sayi + " mükemmel sayı değildir.");
            }
        }
        else{
            System.out.println("0 veya daha küçük bir sayı girmeyiniz.");
        }
        
        
    }
}
