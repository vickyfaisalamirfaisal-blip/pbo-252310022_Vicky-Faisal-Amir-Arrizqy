package Pembelajaran4array;

import javax.swing.JOptionPane;

public class Latihan06 {

    public static void main(String[] args) {

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];

        // Mengisi matriks A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                String input = JOptionPane.showInputDialog(
                        "Masukan nilai A[" + i + "][" + j + "]:");

                if (input == null) return;

                A[i][j] = Integer.parseInt(input);
            }
        }

        // Mengisi matriks B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                String input = JOptionPane.showInputDialog(
                        "Masukan nilai B[" + i + "][" + j + "]:");

                if (input == null) return;

                B[i][j] = Integer.parseInt(input);
            }
        }

        String hasil = "Matriks A:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += A[i][j] + "  ";
            }
            hasil += "\n";
        }

        hasil += "\nMatriks B:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += B[i][j] + "  ";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}