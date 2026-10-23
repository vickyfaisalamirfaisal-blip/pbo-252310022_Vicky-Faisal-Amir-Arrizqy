package spotify;

// Pewarisan: Podcast mewarisi MediaAudio
public class Podcast extends MediaAudio {
    private String host;
    private int episode;

    public Podcast(String judul, int durasiDetik, String host, int episode) {
        super(judul, durasiDetik);
        this.host = host;
        this.episode = episode;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar podcast: " + judul + " (Eps." + episode + ") bersama " + host);
    }
}