package pl.sda.javastart.playlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static pl.sda.javastart.playlists.PlayMode.*;

public class Playlist extends Playable {

    private List<Playable> playables = new ArrayList<>();
    private PlayMode playMode;

    public Playlist(PlayMode playMode) {
        this.playMode = playMode;
    }

    protected void addToPlaylist(Playable playable) {
        playables.add(playable);
    }

    @Override
    protected String play() {
        if (playMode == SEQUENTIAL) {  // metoda na sposob otwrzania muzyki  || do eunumow mozemy stosowac == , zamiast .equals , bo enumy maja te same miejsce w pamieci
            return collectTitles(playables);    // dajemy joining zeby nam polaczylo i \\n zeby byly pod soba napisy jak w liscie
        } else if (playMode == LOOP) {
            String result = "";
            for (int i = 0; i < 10; i++) {  // jest 10 powtorzen

                result = result + collectTitles(playables);  // loop jest to samo co sequential ale dajemy np zeby 10 razy to robilo
            }
            return result;
        } else if (playMode == RANDOM) {   // robimy dla losowego odtwarzania
            List<Playable> tempList = new ArrayList<>(playables);  // tworzymy nowa liste zeby na niej robic shuffle , zeby nasza oryginalna liste nie mieszalo losowo tylko tego clona
            Collections.shuffle(tempList);
            return collectTitles(tempList);
        }
        return "ERROR!!";
    }

    private String collectTitles(List<Playable> playables) {
        return playables.stream()
                .map(p -> p.play())
                .collect(Collectors.joining("\n")); // dajemy joining zeby nam polaczylo i \\n zeby byly pod soba napisy jak w liscie
    }
}
