package javaapplication1;
import java.util.Scanner;
/*
 *
 * @author TugceK
 */
public class CiftSayiBulanPrg {
    public static void main(String[] args) {
        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = input.nextInt();
        
        for (int i = 0; i <= sayi; i++) {
            if ( i%2 == 0){
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n-----");
        
        int toplam = 0;
        int count = -1; // 0 sayısını da tam bölünüyor olarak saymak istemedim. Eğer 0'ı da saysın istersek count=0 olarak almalıyız.
        for (int i = 0; i <= sayi; i++) {
            if ( i % 12 == 0){
                count++;
                toplam += i;
            }
        }
        
        double ort = toplam / count;
        
        System.out.println("Girdiğiniz sayıya kadar olan sayılar içinde 3 ve 4'e tam bölünen sayıların ortalaması\n--> " + ort);
        
    }
}
