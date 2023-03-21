package javaapplication1;

//import java.util.Scanner; //kullanicidan girdi almak için gerekli olan kütüphane

/**
 *
 * @author TugceK
 */
public class CalismaNotlari {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // System.out.print("Hello world");
        
        /*
         byte -> 8 bit
         short -> 16 bit
         int -> 32 bit
         long -> 64 bit
        */
        
        /*
        byte b = 0;
        int a = b++; 
        System.out.println(a); // 0
        System.out.println(b); // 1
        */
        
        /*
        Scanner girdi = new Scanner(System.in ); //import java.util.Scanner; //Scanner sınıfından nesne üreterek(System.in) kullanıcıdan input alabiliriz.
        System.out.print("Adınız: ");
        String name = girdi.next(); //veya nextLine() kullanabilirsin. nextLine() tüm satırı okur.
        System.out.print("Yaşınız: ");
        int sayi = girdi.nextInt();
        System.out.println(name);
        System.out.println(sayi);
        */
        
        //double türündeki veri virgüllü girilmeli.
        
        //Stringler için eşitlik durumu .equals("") metodu ile kontrol edilir
        
        /*
        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) 
                    continue;  //Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.
                System.out.print(i + j);
            }
        }    // ----> 345
        */
        /*
        for (int k = 0; k < 9; k++) {
            System.out.print("*");   //yıldızın if kosulundan önce olmasına dikkat! yani 4 tane yıldız çıktısı verir.
            if (k == 3)              
                break;               
        }
        */
    }
    
}
