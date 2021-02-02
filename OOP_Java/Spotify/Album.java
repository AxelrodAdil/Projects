package OOP_Java.Spotify;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable {
    private int id;
    private String title;
    private ArrayList<Soundtrack> tracks;

    public Album() {
        this.tracks = new ArrayList<>();
    }

    public Album(int id, String title, ArrayList<Soundtrack> tracks) {
        this.id = id;
        this.title = title;
        this.tracks = tracks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Soundtrack> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Soundtrack> tracks) {
        this.tracks = tracks;
    }

    public void printData() {
        System.out.println("Id: " + id + ", title: " + title + ", tracks: ");
        for (Soundtrack track : tracks)
            System.out.println(track);
    }
}
