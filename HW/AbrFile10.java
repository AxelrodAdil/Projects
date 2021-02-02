package HW;

import java.io.*;

public class AbrFile10 {
    /*
    Дан файл целых чисел.
    Создать новый файл, содержащий те же элементы,
    что и исходный файл, но в обратном порядке.
     */

    static void solve (PrintWriter out) {
        try {
            FileInputStream myFirstFile = new FileInputStream("MyFirstFile");
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFirstFile));
            String str = reader.readLine();
            out.println(str);
            myFirstFile.close();

            StringBuilder stringNew = new StringBuilder();
            stringNew.append(str);
            stringNew = stringNew.reverse();

            java.io.File mySecondFile = new File("MySecondFile");
            FileWriter writer = new FileWriter("MySecondFile");
            writer.write(new String(stringNew));
            writer.close();
            out.println("---------------");
            out.println(stringNew);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    void run() {
        try(PrintWriter out = new PrintWriter(System.out)){
            solve(out);
        }
    }

    public static void main(String[] args) {
        new AbrFile10().run();
    }
}