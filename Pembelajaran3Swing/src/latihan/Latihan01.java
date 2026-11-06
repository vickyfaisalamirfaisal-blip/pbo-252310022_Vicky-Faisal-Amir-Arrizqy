
package latihan;

import javax.swing.JOptionPane;

public class Latihan01 {

    public static void main(String[] args) {

        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog("Masukkan Fullname:");
        String usia = JOptionPane.showInputDialog("Masukkan Usia:");
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");

        data.simpanData(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
            "BIODATA DIRI\n\n" +
            "Fullname : " + data.fullname + "\n" +
            "Usia     : " + data.usia + "\n" +
            "Alamat   : " + data.alamat
        );
    }
}