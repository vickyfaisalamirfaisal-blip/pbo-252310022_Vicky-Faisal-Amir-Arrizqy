package Pembelajaran4array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {

    public static void main(String[] args) {

        ArrayList<Integer> nilai = new ArrayList<>();

        String jumlah = JOptionPane.showInputDialog(
                "Masukan jumlah data:");

        if (jumlah == null) return;

        int n = Integer.parseInt(jumlah);

        if (n <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Jumlah data harus lebih dari 0");
            return;
        }

        for (int i = 0; i < n; i++) {

            String input = JOptionPane.showInputDialog(
                    "Masukan angka ke-" + i + ":");

            if (input == null) return;

            nilai.add(Integer.parseInt(input));
        }

        int terbesar = nilai.get(0);
        int terkecil = nilai.get(0);

        for (int i = 0; i < nilai.size(); i++) {

            if (nilai.get(i) > terbesar) {
                terbesar = nilai.get(i);
            }

            if (nilai.get(i) < terkecil) {
                terkecil = nilai.get(i);
            }
        }

        String hasil = "OUTPUT ARRAYLIST\n";

        for (int i = 0; i < nilai.size(); i++) {
            hasil += "x[" + i + "] = " + nilai.get(i) + "\n";
        }

        hasil += "\nNilai terbesar: " + terbesar;
        hasil += "\nNilai terkecil: " + terkecil;

        JOptionPane.showMessageDialog(null, hasil);
    }
}