package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class ArtikYil {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        /*
        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
        */
        System.out.print("Bir yıl giriniz: ");
        int yil = input.nextInt();
        
        if ( yil % 4 == 0){
            if ( yil % 100 == 0){
                if ( yil % 400 == 0){
                    System.out.println(yil + " artık yıldır.");
                }
                else{
                    System.out.println(yil + " artık yıl değildir.");
                }
            }
            else{
                System.out.println(yil + " artık yıldır.");
            }
        }
        else{
            System.out.println(yil + " artık yıl değildir.");
        }
    }
}
