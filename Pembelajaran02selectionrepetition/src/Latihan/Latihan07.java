package Latihan;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String pinBenar = "252310022";
        String pin;

        long saldo = 1000000;
        int pilihan;

        do {
            System.out.print("Masukkan PIN: ");
            pin = input.nextLine();

            if (!pin.equals(pinBenar)) {
                System.out.println("PIN salah, silakan coba kembali.");
            }

        } while (!pin.equals(pinBenar));

        System.out.println("PIN benar. Selamat datang!");

        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("Saldo Anda: Rp" + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan nominal setor: Rp");
                    long setor = input.nextLong();

                    if (setor > 0) {
                        saldo += setor;
                        System.out.println("Setor tunai berhasil.");
                        System.out.println("Saldo sekarang: Rp" + saldo);
                    } else {
                        System.out.println("Nominal tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nominal tarik: Rp");
                    long tarik = input.nextLong();

                    if (tarik > 0 && tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil.");
                        System.out.println("Saldo sekarang: Rp" + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup atau nominal tidak valid.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}