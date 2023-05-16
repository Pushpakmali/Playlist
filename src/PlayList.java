import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class PlayList {
    private String title;
    private List<Song> songs;
    private boolean wasNext = false;

    private ListIterator<Song> itr;

    public PlayList(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
        itr = songs.listIterator();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    //Add song to playList from album
    public String addSongFromAlbum(Album album, String songName){
        Optional<Song> songOp= album.searchSong(songName);
        if(songOp.isEmpty()){
            return "Song not found in albums";
        }

        Song songInAlbum = songOp.get();
        this.songs.add(songInAlbum);
        itr = songs.listIterator();
        return "Song added succesfully";
    }

    public String playNext(){
        if(wasNext){
        }
        if(!wasNext){
            wasNext = true;
            itr.next();
        }
        if(itr.hasNext()){
            wasNext=true;
            Song song = itr.next();
            return "Next Song is :" + song;
        }

        return "You have reached the end of playlist";
    }

    public String playPrevious(){
        if(!wasNext){
        }
        if(wasNext){
            wasNext = false;
            itr.previous();
        }
        if(itr.hasPrevious()){
            wasNext = false;
            Song song = itr.previous();
            return "Previous Song : "+song;
        }

        return "You have reached start of playlist";
    }

    public String currentSong(){
        if(wasNext){
            wasNext = false;
            return "Current song is : "+itr.previous();
        }

        wasNext=true;
        return "Current song is : "+itr.next();
    }
}
