// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Album album1 = new Album("RookStar", "A.R.Rehman");
       album1.addSong(new Song("Meeting Place", "A.R.Rehman", 2));
       album1.addSong(new Song("The Dichotomy of fame", "A.R.Rehman", 3));
       album1.addSong(new Song("Kun Faya Kun", "A.R.Rehman And Javed Ali", 1));

       Album album2 = new Album("Best of KK", "KK");
       album2.addSong(new Song("Aakhon Mein Teri", "KK", 3));
       album2.addSong(new Song("Haan Tu Hain", "KK", 4));
       album2.addSong(new Song("Kya Mujhe Pyar Hai", "KK", 5));

       PlayList myPlayList = new PlayList("myPlayList");
       myPlayList.addSongFromAlbum(album1, "Meeting Place");
       myPlayList.addSongFromAlbum(album1, "Kun Faya Kun");
       myPlayList.addSongFromAlbum(album2, "Aakhon Mein Teri");
       myPlayList.addSongFromAlbum(album2, "Kya Mujhe Pyar Hai");

        System.out.println(myPlayList.currentSong());   //Meeting Place
        System.out.println(myPlayList.playPrevious());   //null
        System.out.println(myPlayList.playNext());       //Kun faya kun
        System.out.println(myPlayList.playNext());      //Aakhon mein teri
        System.out.println(myPlayList.currentSong());   //Aakhon mein teri
        System.out.println(myPlayList.playPrevious());   //Kun faya kun
        System.out.println(myPlayList.currentSong());     //Kun faya kun

    }
}