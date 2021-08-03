package cwicz61do90.cwicz70;

import java.util.List;
import java.util.stream.Collectors;

class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );
        int sum = sumTimeAllSongsForGenre(songs, Song.Genre.POP);
        System.out.println("łączny czas pionenek z gatunku " + Song.Genre.POP + " to " + sum);
        long numSongs = countArtistSongs(songs, "Metallica");
        System.out.println("Ilość piosenek Metallica to " + numSongs);

        List<Song> songsWithoutMetal = listSongsWithoutGenre(songs, Song.Genre.METAL);
        songsWithoutMetal.forEach(System.out::println);
    }

    //TODO
    private static int sumTimeAllSongsForGenre(List<Song> songList, Song.Genre genre) {
        return songList.stream()
                .filter(s -> s.getGenre() == genre)
                .mapToInt(Song::getLength)
                .sum();
    }

    private static long countArtistSongs(List<Song> songList, String artist) {
        return songList.stream()
                .filter(s -> s.getArtist().equals(artist))
                .count();
    }

    private static List<Song> listSongsWithoutGenre(List<Song> songList, Song.Genre genre) {
        return songList.stream()
                .filter(s -> s.getGenre() != genre)
                .distinct()
                .collect(Collectors.toList());
    }
}
