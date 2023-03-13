package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author TugceK
 */

public class Siralama {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double num1, num2, num3;
        
        System.out.println("Sıralanacak 3 sayıyı sırayla giriniz:");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        
        if (num1 < num2 && num1 < num3){
            if (num2 < num3){
                System.out.println(num3 + " > " + num2 + " > " + num1);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
        } else if (num2 < num3 && num2 < num1) {
            if (num3 < num1){
                System.out.println(num1 + " > " + num3 + " > " + num2);
            } else {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            }
        } else if (num3 < num1 && num3 < num2) {
            if (num1 < num2){
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            }
        } else {
            System.out.println("Geçersiz!");
        }
    }
}
