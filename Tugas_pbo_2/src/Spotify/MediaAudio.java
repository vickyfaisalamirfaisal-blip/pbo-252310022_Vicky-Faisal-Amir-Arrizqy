package spotify;

// Abstraksi: kelas abstrak, tidak bisa dibuat objeknya langsung
public abstract class MediaAudio {
    protected String judul;
    protected int durasiDetik;

    public MediaAudio(String judul, int durasiDetik) {
        this.judul = judul;
        this.durasiDetik = durasiDetik;
    }

    // Metode abstrak: wajib di-override oleh subclass
    public abstract void putarAudio();
}