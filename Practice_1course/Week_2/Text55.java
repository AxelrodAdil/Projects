package Practice.Week_2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
/*
Дан текстовый файл. Создать символьный файл, содержащий все символы,
встретившиеся в тексте, включая пробел и знаки препинания (без повторений).
Символы располагать в порядке возрастания их кодов.
*/
public class Text55 {
/*
--- Дан текстовый файл. Символы располагать в порядке возрастания их кодов. ---
input: Adil_text_55
output:
 .ДСавгдезийклмнопрстфхыья
Created a new file
*/

    private static List<Character> chars = new ArrayList<>();

    void create_newFile (String str) {
        try {
            File myFile = new File("Adil_text_55_result");

            File file = new File("C://Users//ASUS//IdeaProjects//Adil//Adil_text_55_result");
            DataOutputStream outstream = new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get_String(char[] strChars) {
        StringBuilder sb = new StringBuilder(strChars.length);
        for (char character : strChars) {
            if (character != 0) sb.append(character);
        }
        return sb.toString();
    }

    public static String replaceDuplicates(String string) {      //brute force
        if (string == null || string.length() < 2) return string;
        int position = 1;
        char[] characters = string.toCharArray();
        for (int i = 1; i < string.length(); i++) {
            int j;
            for (j = 0; j < position; ++j) {
                if (characters[i] == characters[j]) {
                    break;
                }
            }
            if (j == position) {
                characters[position] = characters[i];
                position++;
            } else {
                characters[position] = 0;
                position++;
            }
        }
        return get_String(characters);
    }

    void solve(Scanner sc) {
        String File = sc.nextLine();   //Adil_text_55
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader
                    (new File("C:\\Users\\ASUS\\IdeaProjects\\Adil\\" + File)));
            int c;
            while ((c = reader.read()) != -1) {
                chars.add((char) c);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(chars);    //ArrayList is sorted
        //System.out.println(chars.toString());

        String string =  chars.stream().map(String::valueOf).collect(Collectors.joining());
        String result = replaceDuplicates(string);
        System.out.println(result);
        System.out.println("Created a new file");
        create_newFile(result);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new Text55().run();
    }
}