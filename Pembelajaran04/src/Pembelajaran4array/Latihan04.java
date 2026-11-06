package Pembelajaran4array;

import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {

        String jumlah = JOptionPane.showInputDialog(
                "Masukan jumlah array:");

        if (jumlah == null) return;

        int n = Integer.parseInt(jumlah);

        if (n <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Jumlah array harus lebih dari 0");
            return;
        }

        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {

            String input = JOptionPane.showInputDialog(
                    "Masukan angka untuk array ke-" + i + ":");

            if (input == null) return;

            nilai[i] = Integer.parseInt(input);
        }

        int terbesar = nilai[0];
        int terkecil = nilai[0];

        for (int i = 1; i < nilai.length; i++) {

            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }

            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        String hasil = "Output Array\n";

        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "] = " + nilai[i] + "\n";
        }

        hasil += "\nNilai terbesar adalah " + terbesar;
        hasil += "\nNilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil);
    }
}

