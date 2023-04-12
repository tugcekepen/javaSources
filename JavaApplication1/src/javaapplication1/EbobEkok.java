package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author TugceK
 */
public class EbobEkok {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        
        int sayi1, sayi2, min, ebob=1, ekok=1;
        
        System.out.println("Ebob-Ekok için iki sayı giriniz:");
        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();
        
        if(sayi1<sayi2){
            min = sayi1;
        }else{
            min = sayi2;
        }
        
        for (int i = 1; i <= min; i++) {
            if(sayi1%i==0 && sayi2%i==0){
                ebob = i;
            }
        }
        ekok = (sayi1*sayi2)/ebob;
        
        System.out.println("Ebob = " + ebob+ "\nEkok = " + ekok);
        */
        
        Scanner scan = new Scanner(System.in);
        
        int sayi1, sayi2, min, ebob=1, ekok=1, i=1;
        
        System.out.println("Ebob-Ekok için iki sayı giriniz:");
        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();
        
        if(sayi1<sayi2){
            min = sayi1;
        }else{
            min = sayi2;
        }
        
        while(i<=min){
            if(sayi1%i==0 && sayi2%i==0){
                ebob = i;
            }
            i++;
        }
        
        ekok = (sayi1*sayi2)/ebob;
        
        System.out.println("Ebob = " + ebob+ "\nEkok = " + ekok);
    }
}
