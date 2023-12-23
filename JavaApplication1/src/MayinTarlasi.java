import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    private final int[][] mayinAlan;
    private final char[][] oyunTahtasi;
    private final int boyut;
    private final int mayinSayisi;

    public MayinTarlasi(int boyut) {
        this.boyut = boyut;
        this.mayinAlan = new int[boyut][boyut];
        this.oyunTahtasi = new char[boyut][boyut];
        this.mayinSayisi = boyut * boyut / 4;
        oyunuBaslat();
    }

    private void oyunuBaslat() {
        mayinlariYerlestir();
        tahtayiDoldur();
    }

    private void mayinlariYerlestir() {
        Random random = new Random();
        for (int i = 0; i < mayinSayisi; i++) {
            int satir = random.nextInt(boyut);
            int sutun = random.nextInt(boyut);
            if (mayinAlan[satir][sutun] == 0) {
                mayinAlan[satir][sutun] = 1;
            } else {
                i--; // Mayını tekrar yerleştirmek için yeniden deneyin
            }
        }
    }

    private void tahtayiDoldur() {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                oyunTahtasi[i][j] = '-';
            }
        }
    }

    private void tahtayiYazdir() {
        System.out.println("===========================");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(oyunTahtasi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    private boolean gecerliHamleMi(int satir, int sutun) {
        return satir >= 0 && satir < boyut && sutun >= 0 && sutun < boyut;
    }

    private void bosHucreleriAc(int satir, int sutun) {
        if (!gecerliHamleMi(satir, sutun) || oyunTahtasi[satir][sutun] != '-') {
            return;
        }

        int etraftakiMayinlar = etrahtakiMayinSayisi(satir, sutun);
        oyunTahtasi[satir][sutun] = (char) (etraftakiMayinlar + '0');

        if (etraftakiMayinlar == 0) {
            bosHucreleriAc(satir - 1, sutun);
            bosHucreleriAc(satir + 1, sutun);
            bosHucreleriAc(satir, sutun - 1);
            bosHucreleriAc(satir, sutun + 1);
            bosHucreleriAc(satir - 1, sutun - 1);
            bosHucreleriAc(satir - 1, sutun + 1);
            bosHucreleriAc(satir + 1, sutun - 1);
            bosHucreleriAc(satir + 1, sutun + 1);
        }
    }

    private int etrahtakiMayinSayisi(int satir, int sutun) {
        int mayinSayisi = 0;
        for (int i = satir - 1; i <= satir + 1; i++) {
            for (int j = sutun - 1; j <= sutun + 1; j++) {
                if (gecerliHamleMi(i, j) && mayinAlan[i][j] == 1) {
                    mayinSayisi++;
                }
            }
        }
        return mayinSayisi;
    }

    public void oyunuOyna() {
        Scanner scanner = new Scanner(System.in);
        int satir, sutun;

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        tahtayiYazdir();

        while (true) {
            System.out.print("Satır Giriniz : ");
            satir = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            sutun = scanner.nextInt();

            if (!gecerliHamleMi(satir, sutun)) {
                System.out.println("Geçersiz bir hamle, lütfen tekrar giriniz.");
                continue;
            }

            if (mayinAlan[satir][sutun] == 1) {
                System.out.println("Game Over!!");
                tahtayiYazdirMayinlarla();
                break;
            } else {
                bosHucreleriAc(satir, sutun);
                tahtayiYazdir();
            }

            if (kazanmaKontrolu()) {
                System.out.println("Oyunu Kazandınız !");
                tahtayiYazdirMayinlarla();
                break;
            }
        }
    }

    private boolean kazanmaKontrolu() {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (oyunTahtasi[i][j] == '-' && mayinAlan[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private void tahtayiYazdirMayinlarla() {
        System.out.println("===========================");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (mayinAlan[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(oyunTahtasi[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayın Tarlası Boyutunu Giriniz: ");
        int boyut = scanner.nextInt();

        MayinTarlasi mayinTarlasi = new MayinTarlasi(boyut);
        mayinTarlasi.oyunuOyna();
    }
}