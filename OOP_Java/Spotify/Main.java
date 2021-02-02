package OOP_Java.Spotify;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static final Scanner scn = new Scanner(System.in);

    public static final IFile fileManager = new FileManager();

    private static byte selection() {
        System.out.print("[1] Read album data from file\n[2] Read album data from console\n[3] List of albums\n[0] Exit\nChoose: ");
        return scn.nextByte();
    }

    private static byte selectTracks() {
        System.out.println("[1] Add track\n[2] Tracks in album\n[0] Add album");
        return scn.nextByte();
    }

    public static void main(String[] args) {
        for (byte selection = selection(); selection != 0; selection = selection()) {
            switch (selection) {
                case 1: {
                    ArrayList<Album> albums = fileManager.read();
                    Album album = getFileAlbum();
                    album.printData();
                    albums.add(album);
                    fileManager.write(albums);
                    break;
                }

                case 2: {
                    Album album = new Album();
                    album.setId(fileManager.read().size() + 1);
                    System.out.print("Album title: ");
                    album.setTitle(scn.next());
                    for (byte selectTracks = selectTracks(); selectTracks != 0; selectTracks = selectTracks()) {
                        switch (selectTracks) {
                            case 1: {
                                System.out.print("Track name: ");
                                String name = scn.next();
                                System.out.print("Genre: ");
                                String genre = scn.next();
                                System.out.print("Duration: ");
                                double duration = Double.parseDouble(scn.next());
                                System.out.print("Singer name: ");
                                String singerName = scn.next();
                                System.out.print("Singer surname: ");
                                String singerSurname= scn.next();
                                album.getTracks().add(new Soundtrack(name, genre, duration, new Singer(singerName, singerSurname)));
                                break;
                            }
                            case 2: {
                                for (Soundtrack track : album.getTracks())
                                    System.out.println(track);
                                break;
                            }
                        }
                    }
                    ArrayList<Album> albums = fileManager.read();
                    album.printData();
                    albums.add(album);
                    fileManager.write(albums);
                    break;
                }
                case 3: {
                    ArrayList<Album> albums = fileManager.read();
                    for (Album album : albums)
                        album.printData();
                    break;
                }
            }
        }
    }

    private static Album getFileAlbum() {
        Album album = new Album();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("albumData.txt"));
            album.setTitle(reader.readLine());
            for (String line = reader.readLine(); line != null; line = reader.readLine())
                album.getTracks().add(new Soundtrack(line));
            album.setId(fileManager.read().size() + 1);
        } catch (Exception e){
            e.printStackTrace();
        }
        return album;
    }
}
