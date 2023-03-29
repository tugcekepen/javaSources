package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class Kombinasyon {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner scan = new Scanner(System.in);
        int n, r;
        System.out.print("Kombinasyon ( C(n,r) ) için n ve r tam sayılarını giriniz\n"
                + "--> n : ");
        n = scan.nextInt();
        System.out.print("--> r : ");
        r = scan.nextInt();
        
        int fact1 = 1;
        for (int i = 1; i<=n; i++) {
            fact1 *= i;
        }
        
        int fact2 = 1;
        for (int i = 1; i<=r; i++) {
            fact2 *= i;
        }
        
        int fact3 = 1;
        for (int i = 1; i<=(n-r); i++) {
            fact3 *= i;
        }
        
        double comb = fact1 / (fact2 * fact3);
        System.out.print("C("+n+","+r+") = "+ comb);
    }
}
