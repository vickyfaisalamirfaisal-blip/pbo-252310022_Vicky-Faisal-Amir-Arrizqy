package Pembelajaran4array;

public class Latihan02 {

    public static void main(String[] args) {

        int[] nilai = new int[5];

        // Mengisi nilai array menggunakan looping
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = (i + 1) * 10;
        }

        // Mencetak nilai array
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai[" + i + "] = " + nilai[i]);
        }
    }
}
