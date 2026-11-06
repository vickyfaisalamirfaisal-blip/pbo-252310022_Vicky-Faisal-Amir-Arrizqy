package Pembelajaran4array;

import javax.swing.JOptionPane;

public class Latihan05 {

    public static void main(String[] args) {

        String[] field = {
            "Nama Lengkap",
            "Alamat",
            "No Telp"
        };

        String[] data = new String[3];

        for (int i = 0; i < field.length; i++) {

            data[i] = JOptionPane.showInputDialog(
                    "Masukan " + field[i] + ":");

            if (data[i] == null) return;
        }

        String hasil =
                "Nama Lengkap: " + data[0] +
                "\nAlamat: " + data[1] +
                "\nNo Telp: " + data[2];

        JOptionPane.showMessageDialog(null, hasil);
    }
}
