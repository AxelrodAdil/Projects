package OOP_Java.Spotify;

import java.util.ArrayList;

public interface IFile {
    ArrayList<Album> read();
    void write(ArrayList<Album> albums);
}
