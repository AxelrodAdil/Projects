package Problems_leetcode_acmp;

import java.util.Scanner;

public class acmp_63 {
    /**
     * on 20.11.2020, 16:07
     * Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. Петя помогает Кате по математике.
     * Он задумывает два натуральных числа X и Y (X,Y≤1000), а Катя должна их отгадать.
     * Для этого Петя делает две подсказки. Он называет сумму этих чисел S и их произведение P.
     * Помогите Кате отгадать задуманные Петей числа.
     *
     * Входной файл INPUT.TXT содержит два натуральных числа S и P, разделенных пробелом.
     */
    public static final Scanner sc = new Scanner(System.in);

    void solveMethod() {
        int s = sc.nextInt();
        int p = sc.nextInt();
        // sum(x,y)=s  x*y=p
        for (int x=0; x<=1000; x++){
            for (int y=0; y<=1000; y++){
                if (x+y==s && x*y==p){
                    System.out.println(""+x+" "+y);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new acmp_63().solveMethod();
    }
}
