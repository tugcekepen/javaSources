package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        String sayi = scan.nextLine();
        char[] sayilar = new char[sayi.length()];
        
        for (int i = 0; i < sayi.length(); i++) {
            sayilar[i] = sayi.charAt(i);
        }
        
        int toplam = 0;
        for (char c : sayilar) {
            toplam += Character.getNumericValue(c); //char ile tutulan ifadeyi (int) şeklinde tür dönüştürünce ASCII karşılığını işleme sokuyor
        }                                              //bu yüzden ifadenin Unicode karşılığındaki sayısal değerini almak için Character.getNumericValue(char)'den faydalandık.
        
        System.out.println("Girilen sayının basamak sayıları toplamı = "+ toplam);
    }
}
