package PembelajaranArray5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            ArrayList<Integer> barisA = new ArrayList<>();
            ArrayList<Integer> barisB = new ArrayList<>();

            for (int j = 0; j < 2; j++) {

                int a = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai Matriks A [" + i + "][" + j + "]"
                    )
                );

                int b = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai Matriks B [" + i + "][" + j + "]"
                    )
                );

                barisA.add(a);
                barisB.add(b);
            }

            A.add(barisA);
            B.add(barisB);
        }

        for (int i = 0; i < 2; i++) {

            ArrayList<Integer> barisC = new ArrayList<>();

            for (int j = 0; j < 2; j++) {

                int jumlah = 0;

                for (int k = 0; k < 2; k++) {

                    jumlah += A.get(i).get(k) * B.get(k).get(j);

                }

                barisC.add(jumlah);
            }

            C.add(barisC);
        }

        String hasil = "HASIL PERKALIAN MATRIKS A x B\n";

        for (ArrayList<Integer> baris : C) {
            hasil += baris + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
