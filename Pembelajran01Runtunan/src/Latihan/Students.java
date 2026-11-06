package Latihan;

public class Students {

    private String npm;
    private String nama;
    private String kelas;
    private int semester;
    private double ipk;

    public Students(String npm, String nama, String kelas,
                    int semester, double ipk) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
        this.semester = semester;
        this.ipk = ipk;
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public int getSemester() {
        return semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void tampilkanData() {
        System.out.println("NPM      : " + npm);
        System.out.println("Nama     : " + nama);
        System.out.println("Kelas    : " + kelas);
        System.out.println("Semester : " + semester);
        System.out.println("IPK      : " + ipk);
    }
}
