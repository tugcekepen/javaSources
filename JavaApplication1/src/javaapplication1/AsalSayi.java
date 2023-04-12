package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-100 arasındaki asal sayılar;");
        var asal = new ArrayList<Integer>();
        for (int i = 1; i < 100; i++) {
            boolean result = asalmi(i);
            if(result){
                asal.add(i);
            }
        }
        for (Integer sayi : asal) {
            System.out.print(sayi + " ");
        }
    }
    
    public static boolean asalmi(int a){
        for ( int k = 2; k<a; k++){
            if(a%k==0){
                return false;
            }
        }
        if(a==1){
            return false;
        }
        return true;
    }
}
