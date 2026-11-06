package Latihan;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int n = input.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {

            int jumlah = (i < n) ? n - i : i - n + 2;

            for (int j = 0; j < n; j++) {
                if (j < jumlah) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = n - 1; j >= 0; j--) {
                if (j < jumlah) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        input.close();
    }
}