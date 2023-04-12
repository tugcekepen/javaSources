package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Ters üçgen için sayı girin: ");
        int n = input2.nextInt();
        
        for (int i = n; i >= 1; i--) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k >= 1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
