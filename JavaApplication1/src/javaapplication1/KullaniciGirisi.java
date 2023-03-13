package javaapplication1;
/**
 *
 * @author TugceK
 */

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        
        String username, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı: ");
        username = input.nextLine();
        System.out.print("Şifre: ");
        password = input.nextLine();
        
        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }
        else{
            System.out.println("Bilgileriniz yanlış!\nŞifrenizi sıfırlamak istiyor musunuz?\nEvet(e)/Hayır(h)");
            String select = input.nextLine().toLowerCase();
            if(select.equals("evet") || select.equals("e")){
                System.out.print("Kullanıcı adı: ");
                username = input.nextLine();
                System.out.print("Şifre: ");
                password = input.nextLine();
                if(password.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu!");
                }
            }
            else if(select.equals("hayır") || select.equals("h")){
                System.out.println("Giriş yapılamadı!");
            }
        }
    }
}
