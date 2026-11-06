package Latihan;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        String hasil = kalimat.toUpperCase();

        System.out.println("Hasil huruf besar: " + hasil);

        input.close();
    }
}
