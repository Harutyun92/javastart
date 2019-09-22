package pl.sda.javastart.playlists;

import lombok.AllArgsConstructor;

@AllArgsConstructor   // zamiast konstruktora mozna zrobic lomboka
public class Music extends Playable {

    private String author;
    private String title;

    @Override
    protected String play() {
        return "Music: " + author + ", " + title;
    }
}
