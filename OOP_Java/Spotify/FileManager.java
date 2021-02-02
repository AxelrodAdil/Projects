package OOP_Java.Spotify;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManager implements IFile{
    @Override
    public ArrayList<Album> read() {
        ArrayList<Album> albums = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("albums.txt"));
            albums = (ArrayList<Album>) inputStream.readObject();
            inputStream.close();
        } catch (Exception e){
            write(albums);
        }
        return albums;
    }

    @Override
    public void write(ArrayList<Album> albums) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("albums.txt"));
            outputStream.writeObject(albums);
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
