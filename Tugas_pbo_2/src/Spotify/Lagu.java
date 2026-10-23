package spotify;

// Pewarisan: Lagu mewarisi MediaAudio
public class Lagu extends MediaAudio {
    private String artis;

    public Lagu(String judul, int durasiDetik, String artis) {
        super(judul, durasiDetik);
        this.artis = artis;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar lagu: " + judul + " - " + artis);
    }
}