package OOP_Java.Spotify;

import java.io.Serializable;

public class Soundtrack implements Serializable {
    private String name;
    private String genre;
    private double duration;
    private Singer singer;

    public Soundtrack(String line) {
        this.name = line.split(" ")[0];
        this.genre = line.split(" ")[1];
        this.duration = Double.parseDouble(line.split(" ")[2]);
        this.singer = new Singer(line.split(" ")[3], line.split(" ")[4]);
    }

    public Soundtrack(String name, String genre, double duration, Singer singer) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return name + ", genre: " + genre + ", duration: " + duration + ", singer: " + singer;
    }
}
