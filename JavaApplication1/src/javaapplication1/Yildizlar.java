package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author TugceK
 */
public class Yildizlar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgen için sayı girin: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        // Ödev - Elmas
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Elmas için sayı girin: ");
        int n2 = input2.nextInt();
        
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n2-1; i >= 1; i--) {
            for (int j = n2-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k >= 1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
