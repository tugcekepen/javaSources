package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = scan.nextInt();
        
        int counter = 0;
        int bolunen = sayi;
        int kalan;
        ArrayList<Integer> kalanlar = new ArrayList<Integer>();
        
        while(bolunen>=1){
            kalan = (int)(bolunen%10);
            kalanlar.add(kalan);
            counter++;
            bolunen = (int)(bolunen/10);
        } 
        
        int toplam = 0;
        for (int i = 0; i < kalanlar.size(); i++) {
            toplam += Math.pow(kalanlar.get(i), kalanlar.size());
        }
        
        if(toplam==sayi){
            System.out.println(sayi + " armstrong sayıdır.");
        }else{
            System.out.println(sayi + " armstrong sayı değildir.");
        }
    }
    
   
}