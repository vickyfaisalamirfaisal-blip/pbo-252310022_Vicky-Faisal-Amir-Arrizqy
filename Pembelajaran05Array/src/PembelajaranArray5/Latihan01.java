package PembelajaranArray5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            ArrayList<Integer> barisA = new ArrayList<>();
            ArrayList<Integer> barisB = new ArrayList<>();

            for (int j = 0; j < 2; j++) {

                int nilaiA = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai Matriks A [" + i + "][" + j + "]"
                    )
                );

                int nilaiB = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai Matriks B [" + i + "][" + j + "]"
                    )
                );

                barisA.add(nilaiA);
                barisB.add(nilaiB);
            }

            A.add(barisA);
            B.add(barisB);
        }

        String hasil = "MATRIKS A\n";

        for (ArrayList<Integer> baris : A) {
            hasil += baris + "\n";
        }

        hasil += "\nMATRIKS B\n";

        for (ArrayList<Integer> baris : B) {
            hasil += baris + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
