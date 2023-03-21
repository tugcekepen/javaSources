package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class TekSayilarinToplami {
    
    public static void tekSayilarinToplami(){
        Scanner input = new Scanner(System.in);
        System.out.print("Herhangi bir tam sayı girin: ");
        int sayi = input.nextInt();
        int toplam = 0;
        while ( sayi >= 0){
            if (sayi % 2 == 1){
                toplam += sayi;
                System.out.println("Sayı: " + sayi + "\nToplam: " + toplam);
            }
            else{
                System.out.println("Sayı: " + sayi + "\nToplam: " + toplam);
            }
            System.out.print("Herhangi bir tam sayı girin: ");
            sayi = input.nextInt();
        }
        System.out.println("Program sonlandı.");
    }
    
    public static void dordunKatlarininToplami(){
        Scanner input = new Scanner(System.in);
        System.out.print("Herhangi bir tam sayı girin: ");
        int sayi = input.nextInt();
        
        int toplam = 0;
        while (sayi%2==0){
            if(sayi%4==0){
                toplam += sayi;
                System.out.println("Sayı: " + sayi + "\nToplam: " + toplam);
            }
            else{
                System.out.println("Sayı: " + sayi + "\nToplam: " + toplam);
            }
            System.out.print("Herhangi bir tam sayı girin: ");
            sayi = input.nextInt();
        }
        System.out.println("Program sonlandı.");
    }
    
    public static void main(String[] args) {
        
        dordunKatlarininToplami();
        
        System.out.println("---------");
        
        tekSayilarinToplami();
    }
}
