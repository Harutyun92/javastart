package pl.sda.javastart.playlists;

public enum PlayMode {

    SEQUENTIAL("normalnie"), LOOP("petla"), RANDOM("losowo");  // mamy trzy opcje wlaczania muzyki

    private String plName;

    PlayMode(String plName) {
        this.plName = plName;
    }
}
