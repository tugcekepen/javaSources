package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class RecursiveUsluSayi {
    static int Rec(int taban,int us){
        if(us==0){
            return 1;
        }else if(us==1){
            return taban;
        }
        if(taban==0){
            return 0;
        }
        return taban * Rec(taban, us-1);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us = scan.nextInt();
        
        System.out.print("Sonuç : ");
        System.out.println(Rec(taban, us));
    }
}
