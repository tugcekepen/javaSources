package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author TugceK
 */
public class ATMProjesi {
    public static void main(String[] args) {
        
        /*
        String username, password;
        int right = 3, select;
        double balance = 1500;
        
        while (right > 0){
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            
            if (username.equals("patika") && password.equals("dev123")){
                System.out.println("Sisteme giriş yaptınız. Merhaba " + username + " :)");
                do {
                    System.out.println("1- Para Yatırma\n"
                        + "2- Para Çekme\n"
                        + "3- Bakiye Sorgulama\n"
                        + "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    if(select==1){
                        System.out.print("Para miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Bakiyeniz: " + balance);
                    }else if(select==2){
                        System.out.print("Para miktarı: ");
                        int price = input.nextInt();
                        if(price>balance){
                            System.out.println("Bakiye yetersiz.");
                        }else{
                            balance -= price;
                            System.out.println("Bakiyeniz: " + balance);
                        }
                    }else if(select==3){
                        System.out.println("Bakiyeniz: " + balance);
                    }else if(select==4){
                        System.out.println("Çıkış yapılıyor... Tekrar görüşmek üzere!");
                    }
                } while (select!=4);
                break;
            }else{
                right--;
                System.out.println("Hatalı giriş yaptınız!");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }else{
                    System.out.println("Kalan hakkınız = " + right);
                }
            }
            
        }
        */
        
        String username, password;
        int right = 3, select;
        double balance = 1500;
        
        while (right > 0){
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            
            if (username.equals("patika") && password.equals("dev123")){
                System.out.println("Sisteme giriş yaptınız. Merhaba " + username + " :)");
                do {
                    System.out.println("1- Para Yatırma\n"
                        + "2- Para Çekme\n"
                        + "3- Bakiye Sorgulama\n"
                        + "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int price2 = input.nextInt();
                            if(price2>balance){
                                System.out.println("Bakiye yetersiz. Bakiyeniz: " + balance);
                            }else{
                                balance -= price2;
                                System.out.println("Bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor... Tekrar görüşmek üzere!");
                            break;
                        default:
                            continue;
                    } 
                } while (select!=4);
                break;
            }else{
                right--;
                System.out.println("Hatalı giriş yaptınız!");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }else{
                    System.out.println("Kalan hakkınız = " + right);
                }
            }    
            
        }
        
        
    }
}
