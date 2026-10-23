package gofood;

public class PesananFood {
    // 3 atribut private (Soal 7b)
    private String idPesanan;
    private String namaMenu;
    private double totalHarga;

    // Relasi asosiasi: pesanan berhubungan dengan driver
    private Driver driver;

    public PesananFood(String idPesanan, String namaMenu) {
        this.idPesanan = idPesanan;
        this.namaMenu = namaMenu;
        this.totalHarga = 0;
    }

    // Metode public 1: menambah item, ada validasi
    public void tambahItem(double harga, int jumlah) {
        if (harga > 0 && jumlah > 0) {
            totalHarga += harga * jumlah;
        } else {
            System.out.println("Harga/jumlah tidak valid, total tidak diubah!");
        }
    }

    // Metode public 2: total harga hanya bisa dibaca
    public double getTotalHarga() {
        return totalHarga;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}