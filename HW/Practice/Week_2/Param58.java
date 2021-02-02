package Practice.Week_2;

import java.io.*;
import java.util.Scanner;
/*
Описать процедуру DecodeText(S, K), которая дешифрует текстовый файл с именем S,
зашифрованный с использованием кодового смещения K
(способ шифрования описан в задании Param57).
Используя эту процедуру и зная кодовое смещение K,
расшифровать файл с указанным именем.

0 < K < 10
*/
public class Param58 {
/*
--- А Б В Г Д Е Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я

АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ ---
input: Param58
1
output:
*/

    void delete_last_line (String string_file){
        File file = new File("C://Users//ASUS//IdeaProjects//Adil//" + string_file);
        try (RandomAccessFile pressF = new RandomAccessFile(file, "rw")) {
            byte b;
            long length = pressF.length() - 1;
            do {
                pressF.seek(length);
                b = pressF.readByte();
                length = length - 1;
            } while (b != 10 && length > 0);
            pressF.setLength(length + 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void reWrite (String strFile, String mainStr) {
        System.out.println("here-reWrite");
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil//" + strFile);
            DataOutputStream outstream= new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(mainStr.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String Decode_Text (String string, int k){
        String result = "";
        StringBuilder sb = new StringBuilder();
        char[] array_char = new char[string.length()];
        for (int i = 0; i < string.length(); i++){
            array_char[i] = string.charAt(i);
        }

        int n = 0;
        for (int i = 0; i < array_char.length; i++){
            if (1040 <= array_char[i] && array_char[i] <= 1071){
                if (((int)array_char[i]) + k <= 1071){
                    n = ((int)array_char[i]) + k;
                    sb.append((char) n);
                } else if (((int)array_char[i]) + k > 1071){
                    n = ((int)array_char[i]) + k - 32;
                    sb.append((char) n);
                }
            } else if (1072 <= array_char[i] && array_char[i] <= 1103){
                if (((int)array_char[i]) + k <= 1103){
                    n = ((int)array_char[i]) + k;
                    sb.append((char) n);
                } else if (((int)array_char[i]) + k > 1103){
                    n = ((int)array_char[i]) + k - 32;
                    sb.append((char) n);
                }
            } else {
                sb.append(array_char[i]);
            }
        }

        result = sb.toString();
        return result;
    }

    void solve (Scanner sc, PrintWriter out) throws IOException {
        String string_File = sc.nextLine();
        int k = sc.nextInt();

        StringBuilder sb2 = new StringBuilder();
        String str1 = null;
        FileInputStream myFile1 = new FileInputStream(string_File);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(myFile1));
        while ((str1 = reader1.readLine()) != null) {
            String string = Decode_Text(str1, k);
            sb2.append(string);
            sb2.append("\n");
        }
        myFile1.close();

        System.out.println(" ----------- ");
        String result = sb2.toString();
        out.println(result);
        out.println(" --- done --- ");

        reWrite(string_File, result);
        delete_last_line(string_File);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Param58().run();
    }
}