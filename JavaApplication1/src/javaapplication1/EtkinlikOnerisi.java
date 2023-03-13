package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık: ");
        double sicaklik = input.nextDouble();
        
        if(sicaklik<5)System.out.println("Kayak yapabilirsiniz. :)");
        else if(sicaklik>=5 && sicaklik<15)System.out.println("Sinemaya gidebilirsiniz. :) :)");
        else if(sicaklik>=15 && sicaklik<=25)System.out.println("Piknik yapabilirsiniz. :)");
        else if(sicaklik>25)System.out.println("Yüzmeye gidebilirsiniz. :)");
        
    }
}
