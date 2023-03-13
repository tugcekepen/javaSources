package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author TugceK
 */

public class Burclar {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        String ay = input.nextLine();
        System.out.print(ay.substring(0, 1).toUpperCase()+ay.substring(1) + " ayının kaçıncı günü? : ");
        int gun = input.nextInt();
        
        if ( ay.toLowerCase().equals("ocak") ){
            if (gun>=1 && gun<=21){
                System.out.println("Oğlak");
            } else if (gun>21 && gun<=31) {
                System.out.println("Kova");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("şubat") ){
            if (gun>=1 && gun<=19){
                System.out.println("Kova");
            } else if (gun>19 && gun<=29) {
                System.out.println("Balık");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("mart") ){
            if (gun>=1 && gun<=20){
                System.out.println("Balık");
            } else if (gun>20 && gun<=31) {
                System.out.println("Koç");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("nisan") ){
            if (gun>=1 && gun<=20){
                System.out.println("Koç");
            } else if (gun>20 && gun<=30) {
                System.out.println("Boğa");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("mayıs") ){
            if (gun>=1 && gun<=21){
                System.out.println("Boğa");
            } else if (gun>21 && gun<=31) {
                System.out.println("İkizler");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("haziran") ){
            if (gun>=1 && gun<=22){
                System.out.println("İkizler");
            } else if (gun>22 && gun<=30) {
                System.out.println("Yengeç");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("temmuz") ){
            if (gun>=1 && gun<=22){
                System.out.println("Yengeç");
            } else if (gun>22 && gun<=31) {
                System.out.println("Aslan");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("ağustos") ){
            if (gun>=1 && gun<=22){
                System.out.println("Aslan");
            } else if (gun>22 && gun<=31) {
                System.out.println("Başak");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("eylül") ){
            if (gun>=1 && gun<=22){
                System.out.println("Başak");
            } else if (gun>22 && gun<=30) {
                System.out.println("Terazi");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("ekim") ){
            if (gun>=1 && gun<=22){
                System.out.println("Terazi");
            } else if (gun>22 && gun<=31) {
                System.out.println("Akrep");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("kasım") ){
            if (gun>=1 && gun<=21){
                System.out.println("Akrep");
            } else if (gun>21 && gun<=30) {
                System.out.println("Yay");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else if ( ay.toLowerCase().equals("aralık") ){
            if (gun>=1 && gun<=21){
                System.out.println("Yay");
            } else if (gun>21 && gun<=31) {
                System.out.println("Oğlak");
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
        else {
            System.out.println("Yanlış giriş!");
        }
        
    }
}
