package spotify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Playlist bertipe MediaAudio, isinya campuran Lagu dan Podcast
        List<MediaAudio> playlist = new ArrayList<>();
        playlist.add(new Lagu("Hati-Hati di Jalan", 220, "Tulus"));
        playlist.add(new Podcast("Teknologi Masa Depan", 1800, "Deddy", 12));
        playlist.add(new Lagu("Sempurna", 240, "Andra and The Backbone"));

        System.out.println("=== PLAYLIST ===");
        for (MediaAudio media : playlist) {
            media.putarAudio(); // Dynamic Binding: yang jalan sesuai objek aslinya
        }
    }
}