package PembelajaranArray5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan03 {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            ArrayList<String> baris = new ArrayList<>();

            String nama = JOptionPane.showInputDialog(
                "Masukkan Nama Lengkap:"
            );

            String alamat = JOptionPane.showInputDialog(
                "Masukkan Alamat:"
            );

            String telepon = JOptionPane.showInputDialog(
                "Masukkan No Telepon:"
            );

            baris.add(nama);
            baris.add(alamat);
            baris.add(telepon);

            data.add(baris);
        }

        String hasil = "DATA MAHASISWA\n\n";

        for (ArrayList<String> baris : data) {

            hasil += "Nama Lengkap: " + baris.get(0) + "\n";
            hasil += "Alamat: " + baris.get(1) + "\n";
            hasil += "No Telepon: " + baris.get(2) + "\n\n";

        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}