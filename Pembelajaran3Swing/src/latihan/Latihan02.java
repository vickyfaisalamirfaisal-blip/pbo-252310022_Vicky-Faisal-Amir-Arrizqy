package latihan;

import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {

        Biodata data = new Biodata();

        String fullname, usia, alamat;
        int umur;

        while (true) {

            // Input Fullname
            fullname = JOptionPane.showInputDialog("Masukkan Fullname:");

            if (fullname == null) {
                int pilihan = JOptionPane.showConfirmDialog(null,
                    "Apakah anda ingin keluar?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION);

                if (pilihan == JOptionPane.YES_OPTION) {
                    break;
                } else {
                    continue;
                }
            }

            if (fullname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Field Fullname tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Input Usia
            usia = JOptionPane.showInputDialog("Masukkan Usia:");

            if (usia == null) {
                int pilihan = JOptionPane.showConfirmDialog(null,
                    "Apakah anda ingin keluar?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION);

                if (pilihan == JOptionPane.YES_OPTION) {
                    break;
                } else {
                    continue;
                }
            }

            if (usia.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Field Usia tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                continue;
            }

            try {
                umur = Integer.parseInt(usia.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                    "Isian usia harus angka",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Input Alamat
            alamat = JOptionPane.showInputDialog("Masukkan Alamat:");

            if (alamat == null) {
                int pilihan = JOptionPane.showConfirmDialog(null,
                    "Apakah anda ingin keluar?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION);

                if (pilihan == JOptionPane.YES_OPTION) {
                    break;
                } else {
                    continue;
                }
            }

            if (alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Field Alamat tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null,
                    "Masukan alamat minimum 10 karakter",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
                continue;
            }

            // Menyimpan data
            data.simpanData(fullname, usia, alamat);

            // Menampilkan informasi
            JOptionPane.showMessageDialog(null,
                "BIODATA DIRI\n\n" +
                "Fullname : " + data.fullname + "\n" +
                "Usia     : " + data.usia + "\n" +
                "Alamat   : " + data.alamat,
                "Informasi Biodata",
                JOptionPane.INFORMATION_MESSAGE);

            // Konfirmasi keluar
            int pilihan = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);

            if (pilihan == JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}
