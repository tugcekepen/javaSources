package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class UsluSayi {
    public static void main(String[] args) {
        /*
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
        Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        */
        Scanner scan = new Scanner(System.in);
        double taban, us, usluSayi, usluSayi_for=1.0;
        System.out.print("Üssü alınacak sayı: ");
        taban = scan.nextDouble();
        System.out.print("Alınacak üs: ");
        us = scan.nextDouble();
        
        usluSayi = Math.pow(taban, us);
        System.out.println("--> "+usluSayi);
        
        System.out.println("-----------");
        
        //for ile
        for(int i = 1; i<=us; i++){
            usluSayi_for *= taban;
        }
        System.out.println("--> " + usluSayi_for + " (for döngüsü ile hesaplandı.)");
    }
}
