package Pembelajaran4array;

import javax.swing.JOptionPane;

public class Latihan07 {

    public static void main(String[] args) {

        int[][] A = {
            {1, 3},
            {9, 5}
        };

        int[][] B = {
            {4, 5},
            {3, 6}
        };

        int[][] C = new int[2][2];

        String npm = JOptionPane.showInputDialog(
                "Masukan NPM:");

        if (npm == null || npm.trim().isEmpty()) return;

        char digitTerakhir = npm.charAt(npm.length() - 1);

        if (!Character.isDigit(digitTerakhir)) {
            JOptionPane.showMessageDialog(null,
                    "NPM tidak valid");
            return;
        }

        int angka = Character.getNumericValue(digitTerakhir);

        String operasi;

        if (angka % 2 != 0) {

            operasi = "Penjumlahan";

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }

        } else {

            operasi = "Pengurangan";

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
        }

        String hasil = operasi + " Matriks\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += C[i][j] + "  ";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}