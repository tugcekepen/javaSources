package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author TugceK
 */
public class UcakBileti {
    
    public static void Hesap(double km, int age, int travelType){
        double perKm = 0.10, price,totalPrice;
        if (km>0 ) {
            price = perKm * km;
            totalPrice = price;
            System.out.println("İndirimsiz ücret: " + price);
            if(travelType == 2 ) {
                totalPrice *= 0.80;
                System.out.println("Yolculuk indirimi: " + price*0.20);
                if (age<12){
                    totalPrice *= 0.50;
                    System.out.println("Yaş indirimi: " + price*0.80*0.50);
                }
                else if (age>=12 && age<=24){
                    totalPrice *= 0.90;
                    System.out.println("Yaş indirimi: " + price*0.80*0.10);
                }
                else if(age>65){
                    totalPrice *= 0.70;
                    System.out.println("Yaş indirimi: " + price*0.80*0.30);
                }
            }
            else{
                if (age<12){
                    totalPrice *= 0.50;
                    System.out.println("Yaş indirimi: " + price*0.50);
                }
                else if (age>=12 && age<=24){
                    totalPrice *= 0.90;
                    System.out.println("Yaş indirimi: " + price*0.10);
                }
                else if(age>65){
                    totalPrice *= 0.70;
                    System.out.println("Yaş indirimi: " + price*0.30);
                }
            }
            System.out.println("Ödenecek ücret: " + totalPrice);
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        int age,travelType;
        
        System.out.print("Yolculuk tipi için sayı giriniz.\nTek Yön için; 1\nGidiş-Dönüş için; 2\n: ");
        travelType = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Gidilecek yer kaç km uzaklıkta? : ");
        km = input.nextDouble();
        
        if ( travelType <= 0 || travelType >2) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        
        if (age<=0){
            System.out.println("Hatalı Veri Girdiniz !");
        }    
        
        UcakBileti.Hesap(km, age, travelType);
    }
    
}
