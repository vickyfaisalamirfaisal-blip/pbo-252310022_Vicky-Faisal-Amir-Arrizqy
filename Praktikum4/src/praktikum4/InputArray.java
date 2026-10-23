package praktikum4;

import javax.swing.JOptionPane;

public class InputArray{
    public static void main(String[] args) {

        double[] nilai = new double[5];
        double total = 0;
        double rataRata;

        // Input 5 nilai
        for (int i = 0; i < nilai.length; i++) {
            String input = JOptionPane.showInputDialog(
                "Masukkan nilai ke-" + (i + 1) + ":"
            );

            nilai[i] = Double.parseDouble(input);
            total += nilai[i];
        }

        // Menghitung rata-rata
        rataRata = total / nilai.length;

        // Menampilkan hasil
        String hasil = "HASIL NILAI MAHASISWA\n\n";

        for (int i = 0; i < nilai.length; i++) {
            hasil += "Nilai ke-" + (i + 1) + " = " + nilai[i] + "\n";
        }

        hasil += "\nTotal Nilai = " + total;
        hasil += "\nRata-rata = " + rataRata;

        JOptionPane.showMessageDialog(null, hasil);
    }
}