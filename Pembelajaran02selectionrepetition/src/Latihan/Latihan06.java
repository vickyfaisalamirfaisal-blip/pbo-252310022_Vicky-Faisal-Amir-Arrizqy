package Latihan;

import java.util.Scanner;

class Resto {

    private long Harga;

    private long getPrices(int pilihan) {

        if (pilihan == 1) {
            Harga = 22000;
        } else if (pilihan == 2) {
            Harga = 15000;
        } else if (pilihan == 3) {
            Harga = 25000;
        } else {
            Harga = 0;
        }

        return Harga;
    }

    public void chooseMenu() {

        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("\n=== MENU SARAPAN ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Bubur Ayam");
            System.out.println("3. Soto Ayam");

            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            long harga = getPrices(pilihan);

            if (pilihan >= 1 && pilihan <= 3) {

                if (pilihan == 1) {
                    System.out.println("Anda memesan Nasi Goreng");
                } else if (pilihan == 2) {
                    System.out.println("Anda memesan Bubur Ayam");
                } else {
                    System.out.println("Anda memesan Soto Ayam");
                }

                System.out.println("Harga: Rp" + harga);

            } else {
                System.out.println("Maaf menu yang anda masukan salah.");
            }

            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih telah memesan.");
    }
}

public class Latihan06 {
    public static void main(String[] args) {

        Resto resto = new Resto();

        resto.chooseMenu();
    }
}