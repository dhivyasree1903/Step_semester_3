import java.util.Arrays;

public class Playlist {

    private final String[] songs;
    private int songCount;

    // Constructor fixes the maximum playlist capacity
    public Playlist(int capacity) {
        if (capacity <= 0) {
            this.songs = new String[10];
        } else {
            this.songs = new String[capacity];
        }
        this.songCount = 0;
    }

    // Add a new song if space is available
    public void addSong(String title) {
        if (title == null || title.trim().isEmpty()) {
            return;
        }

        if (songCount < songs.length) {
            songs[songCount] = title;
            songCount++;
        } else {
            System.out.println("Playlist is full. Cannot add: " + title);
        }
    }

    // Defensive copy: return a newly allocated copy of added songs
    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    // Read-only count of songs in the playlist
    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {
        System.out.println("--- Playlist Defensive Copying Demo ---");
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        System.out.println("Returned copy: " + Arrays.toString(copy));

        // Attempt to modify the returned array externally
        copy[0] = "Hacked";
        System.out.println("Modified external copy: " + Arrays.toString(copy));

        // Verify playlist internal state remains safe and untouched
        System.out.println("p.getSongs()[0] is still: " + p.getSongs()[0]);
        System.out.println("p.getSongCount() -> " + p.getSongCount());
    }
}
