package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin uzunluğunu giriniz: ");
        int length = scan.nextInt();
        scan.close();
        
        int sayi1 = 0, sayi2 = 1, sayi3;
        
        if(length==1){
            System.out.print(sayi1);
        }
        else{
            System.out.print(sayi1 + " " + sayi2);
            for(int i = 2; i < length; i++) {
                sayi3 = sayi1 + sayi2;
                System.out.print(" " + sayi3);
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
        }
        
    }
}
