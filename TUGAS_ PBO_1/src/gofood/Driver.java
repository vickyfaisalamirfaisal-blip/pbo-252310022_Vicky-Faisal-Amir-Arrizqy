package gofood;

public class Driver {
    private String idDriver;
    private String namaDriver;
    private String status; // "Tersedia" atau "Mengantar"

    public Driver(String idDriver, String namaDriver) {
        this.idDriver = idDriver;
        this.namaDriver = namaDriver;
        this.status = "Tersedia";
    }

    public void ambilPesanan(PesananFood pesanan) {
        if (status.equals("Tersedia")) {
            status = "Mengantar";
            pesanan.setDriver(this); // menghubungkan kedua objek (asosiasi)
            System.out.println(namaDriver + " mengambil pesanan "
                    + pesanan.getIdPesanan() + " (" + pesanan.getNamaMenu() + ")");
        } else {
            System.out.println(namaDriver + " sedang mengantar, tidak bisa ambil pesanan.");
        }
    }

    public void selesaikanPengantaran() {
        status = "Tersedia";
        System.out.println(namaDriver + " selesai mengantar, status: " + status);
    }

    public String getNamaDriver() {
        return namaDriver;
    }
}
