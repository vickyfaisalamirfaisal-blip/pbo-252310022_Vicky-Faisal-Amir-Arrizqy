package Latihan;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama depan: ");
        String namaDepan = input.nextLine();

        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        String hasil = "Nama: ".concat(namaDepan)
                .concat(" ").concat(namaBelakang)
                .concat(", Umur: ").concat(String.valueOf(umur))
                .concat(", NPM: ").concat(npm);

        System.out.println("\n=== DATA DIRI ===");
        System.out.println(hasil);

        input.close();
    }
}
