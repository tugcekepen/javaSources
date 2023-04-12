package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin uzunluğunu giriniz: ");
        int length = scan.nextInt();
        scan.close();
        
        for (int i = 0; i < length; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
    
    public static int Fibonacci(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
