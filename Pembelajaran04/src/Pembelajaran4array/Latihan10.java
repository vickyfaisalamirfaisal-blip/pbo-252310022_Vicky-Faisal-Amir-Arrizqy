package Pembelajaran4array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();

        String[] field = {
            "Nama Lengkap",
            "Alamat",
            "No Telp"
        };

        for (int i = 0; i < field.length; i++) {

            String input = JOptionPane.showInputDialog(
                    "Masukan " + field[i] + ":");

            if (input == null) return;

            data.add(input);
        }

        String hasil = "DATA PRIBADI\n\n";

        hasil += "Nama Lengkap: " + data.get(0) + "\n";
        hasil += "Alamat: " + data.get(1) + "\n";
        hasil += "No Telp: " + data.get(2);

        JOptionPane.showMessageDialog(null, hasil);
    }
}

