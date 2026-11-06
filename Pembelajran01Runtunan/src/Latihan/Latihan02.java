package Latihan;

import java.util.Scanner;

public class Latihan02 {

    // Class Variable
    static String namaProgram = "Menghitung Bangun";

    // Method Luas Layang-layang
    static double luasLayang(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    // Method Keliling Layang-layang
    static double kelilingLayang(double a, double b) {
        return 2 * (a + b);
    }

    // Method Volume Prisma Segitiga
    static double volumePrisma(double alas, double tinggi,
                               double panjang) {
        double luasAlas = (alas * tinggi) / 2;
        return luasAlas * panjang;
    }

    // Method Luas Permukaan Prisma
    static double luasPermukaan(double alas, double tinggi,
                                double s1, double s2,
                                double s3, double panjang) {

        double luasAlas = (alas * tinggi) / 2;

        return (2 * luasAlas)
                + ((s1 + s2 + s3) * panjang);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== " + namaProgram + " ===");

        // Layang-layang
        System.out.println("\n=== LAYANG-LAYANG ===");

        System.out.print("Masukkan diagonal 1: ");
        double d1 = input.nextDouble();

        System.out.print("Masukkan diagonal 2: ");
        double d2 = input.nextDouble();

        System.out.print("Masukkan sisi pendek: ");
        double a = input.nextDouble();

        System.out.print("Masukkan sisi panjang: ");
        double b = input.nextDouble();

        System.out.println("Luas: " + luasLayang(d1, d2));
        System.out.println("Keliling: " + kelilingLayang(a, b));

        // Prisma Segitiga
        System.out.println("\n=== PRISMA SEGITIGA ===");

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan sisi 1: ");
        double s1 = input.nextDouble();

        System.out.print("Masukkan sisi 2: ");
        double s2 = input.nextDouble();

        System.out.print("Masukkan sisi 3: ");
        double s3 = input.nextDouble();

        System.out.print("Masukkan panjang prisma: ");
        double panjang = input.nextDouble();

        System.out.println("Volume Prisma: "
                + volumePrisma(alas, tinggi, panjang));

        System.out.println("Luas Permukaan: "
                + luasPermukaan(alas, tinggi, s1, s2, s3, panjang));

        input.close();
    }
}