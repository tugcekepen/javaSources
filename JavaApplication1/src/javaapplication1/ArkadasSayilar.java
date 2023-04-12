package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class ArkadasSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki tane sayı giriniz: ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        
        if( sayi1>0 && sayi2>0){
            int toplam1 = 0;
            for (int i = 1; i < sayi1; i++) {
                if (sayi1%i==0){
                    toplam1 += i;
                }
            }

            int toplam2 =0;
            for (int i = 1; i < sayi2; i++) {
                if (sayi2%i==0){
                    toplam2 += i;
                }
            }

            if(toplam1==sayi2 && toplam2==sayi1){
                System.out.println("Bu iki sayı arkadaş sayıdır.");
            }else{
                System.out.println("Arkadaş sayı değillerdir.");
            }
        }else{
            System.out.println("0 veya daha küçük sayı girmeyiniz.");
        }
    }
}
