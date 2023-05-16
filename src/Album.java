import java.util.*;
public class Album {
    private String title;
    private String artist;
    private List<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public Album(String title, String artist, List<Song> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    //There is onlt one song with a perticular name
    public String addSong(Song song){

        if(this.findsong(song)){
            return "Song is already exists";
        }

        songs.add(song);
        return "Song Added";
    }

    private boolean findsong(Song song){
        for(Song s : songs){
            if(s.getName().equals(song.getName()) && s.getArtist().equals(song.getArtist()))return true;
        }
        return false;
    }

    public Optional<Song> searchSong(String songName){
        for(Song s : songs){
            if(s.getName().equals(songName)){
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }
}
