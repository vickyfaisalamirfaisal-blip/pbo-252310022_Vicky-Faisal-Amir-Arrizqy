package Latihan;

import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== TOKO SERBAGUNA IBIK ===");

        System.out.println("\n=== DATA MEMBER ===");

        System.out.print("Masukkan NPM member: ");
        String npm = input.nextLine();

        System.out.print("Masukkan nama member: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = input.nextInt();

        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();

        Students member = new Students(
                npm, nama, kelas, semester, ipk);

        System.out.print("\nMasukkan jumlah Roti Enak: ");
        int jumlah = input.nextInt();

        int harga = 6300;
        int subtotal = harga * jumlah;
        double diskon = 0;

        if (jumlah % 3 == 0) {
            diskon = subtotal * 0.05;
        }

        double total = subtotal - diskon;

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Member  : " + member.getNama());
        System.out.println("NPM     : " + member.getNpm());
        System.out.println("Barang  : ROTI ENAK");
        System.out.println("Harga   : Rp" + harga);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Subtotal: Rp" + subtotal);
        System.out.println("Diskon  : Rp" + diskon);
        System.out.println("Total   : Rp" + total);

        input.close();
    }
}