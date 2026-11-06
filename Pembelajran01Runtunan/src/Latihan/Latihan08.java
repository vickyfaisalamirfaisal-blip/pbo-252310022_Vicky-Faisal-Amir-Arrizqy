package Latihan;

import java.util.Scanner;

public class Latihan08 {
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

        Students mahasiswa = new Students(
                npm, nama, kelas, semester, ipk);

        System.out.println("\n=== DATA STUDENTS ===");
        mahasiswa.tampilkanData();

        input.close();
    }
}