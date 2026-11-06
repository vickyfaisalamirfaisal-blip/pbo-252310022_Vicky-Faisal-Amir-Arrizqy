package Latihan;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = input.nextInt();

        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NPM      : " + npm);
        System.out.println("Nama     : " + nama);
        System.out.println("Kelas    : " + kelas);
        System.out.println("Semester : " + semester);
        System.out.println("IPK      : " + ipk);

        input.close();
    }
}