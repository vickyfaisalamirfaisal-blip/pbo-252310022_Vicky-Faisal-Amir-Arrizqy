 package gofood;

public class Main {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("PSN-001", "Nasi Goreng");
        pesanan.tambahItem(25000, 2);
        pesanan.tambahItem(-5000, 1); // ditolak oleh validasi

        Driver driver = new Driver("DRV-01", "Budi");
        driver.ambilPesanan(pesanan);

        System.out.println("Total harga : Rp" + pesanan.getTotalHarga());
        System.out.println("Diantar oleh: " + pesanan.getDriver().getNamaDriver());
        // pesanan.totalHarga = 0; // ERROR: totalHarga bersifat private

        driver.selesaikanPengantaran();
    }
}
