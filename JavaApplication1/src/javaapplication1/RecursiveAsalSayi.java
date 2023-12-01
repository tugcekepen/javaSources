package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author TugceK
 */
public class RecursiveAsalSayi {
   
    static boolean asalMi(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }
        else if (sayi == 2) {
            return true;
        }
        else if (sayi % bolen == 0) {
            return false;
        }
        else if (bolen < sayi / 2) {
            return asalMi(sayi, bolen + 1);
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = scan.nextInt();
        
        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}
