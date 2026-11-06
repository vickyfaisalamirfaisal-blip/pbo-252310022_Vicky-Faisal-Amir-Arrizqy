package Latihan;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String namaToko = "TOKO SERBAGUNA IBIK";
        String namaBarang = "ROTI ENAK";
        int harga = 6300;

        System.out.println("=== " + namaToko + " ===");
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlah = input.nextInt();

        int subtotal = harga * jumlah;
        double diskon = 0;

        if (jumlah % 3 == 0) {
            diskon = subtotal * 0.05;
        }

        double total = subtotal - diskon;

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Tanggal : "
                + LocalDateTime.now().format(format));
        System.out.println("Barang  : " + namaBarang);
        System.out.println("Harga   : Rp" + harga);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Subtotal: Rp" + subtotal);
        System.out.println("Diskon  : Rp" + diskon);
        System.out.println("Total   : Rp" + total);

        input.close();
    }
}