package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
    
        double dikKenar_1, dikKenar_2, hipotenus, kenar_1, kenar_2, kenar_3, alan, cevre, u;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Dik üçgen için;");
        System.out.print("İlk dik kenar uzunluğunu giriniz: ");
        dikKenar_1 = input.nextDouble();
        System.out.print("İkinci dik kenar uzunluğunu giriniz: ");
        dikKenar_2 = input.nextDouble();
        
        hipotenus = Math.sqrt((dikKenar_1 * dikKenar_1) + (dikKenar_2 * dikKenar_2));
        
        System.out.println("Dik üçgenin hipotenüsü: " + hipotenus);
        System.out.println("---");
        
        System.out.println("Üçgen alanı hesaplamak için;");
        System.out.print("Kenar 1: ");
        kenar_1 = input.nextDouble();
        System.out.print("Kenar 2: ");
        kenar_2 = input.nextDouble();
        System.out.print("Kenar 3: ");
        kenar_3 = input.nextDouble();
        
        cevre = kenar_1 + kenar_2 + kenar_3;
        u = cevre / 2 ;
        alan = u * Math.abs(u-kenar_1) * Math.abs(u-kenar_2) * Math.abs(u-kenar_3);
        
        System.out.println("Üçgenin kenarları: " + kenar_1 + "," + kenar_2 + "," + kenar_3);
        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
        
        
    
    }
}
